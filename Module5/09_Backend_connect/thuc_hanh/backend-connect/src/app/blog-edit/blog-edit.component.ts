import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {PostService} from "../post.service";
import {IPost} from "../post";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {error} from "@angular/compiler/src/util";

@Component({
  selector: 'app-blog-edit',
  templateUrl: './blog-edit.component.html',
  styleUrls: ['./blog-edit.component.css']
})
export class BlogEditComponent implements OnInit {
  post! : IPost;
  postForm!: FormGroup;
  constructor(private route: ActivatedRoute,
              private postService: PostService,
              private fb: FormBuilder,
              private router : Router) { }

  ngOnInit(){
    this.postForm = this.fb.group({
      title: ['',[Validators.required],[Validators.minLength(10)]],
      body: ['',[Validators.required],[Validators.minLength(10)]],
    });
    // @ts-ignore
    const id = +this.route.snapshot.paramMap.get('id');
    this.postService.getByPostId(id).subscribe(
      next => {
        this.post = next;
        this.postForm.patchValue(this.post);
      },
      error =>{
        console.log(error);
      }
    );
  }
  onSubmit(){
    if (this.postForm.valid){
      const {value} = this.postForm;
      const data = {
        ...this.post,
        ...value
      };
      this.postService.updatePost(data).subscribe(
        next => {
          this.router.navigate(['/blog']);
        },
        error => console.log(error)
      );

    }
  }
}
