import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  countryList = [
    {id:1,name:'VietNam'},
    {id:2,name:'Canada'},
    {id:3,name:'USA'},
    ];
  contactForm = new FormGroup({
    email : new FormControl('',[Validators.email,Validators.required]),
    password : new FormControl('',[Validators.required,Validators.minLength(6)]),
    confirmPassword : new FormControl('',[Validators.required,Validators.minLength(6)]),
    country : new FormControl(),
    age : new FormControl('',Validators.min(18)),
    gender : new FormControl(),
    phone : new FormControl('',[Validators.required,Validators.pattern("^\\+84\\d{9,10}$")])
  });
  onSubmit(){
    console.log(this.contactForm.value);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
