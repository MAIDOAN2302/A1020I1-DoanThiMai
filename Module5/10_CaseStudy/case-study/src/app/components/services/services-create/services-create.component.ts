import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ServicesService} from "../../../service/services.service";

@Component({
  selector: 'app-services-create',
  templateUrl: './services-create.component.html',
  styleUrls: ['./services-create.component.css']
})
export class ServicesCreateComponent implements OnInit {

// @ts-ignore
  public formCreateNewServices: FormGroup;

  constructor(public formBuilder: FormBuilder,
              public servicesService: ServicesService,
              public router: Router) { }

  ngOnInit(){
    this.formCreateNewServices = this.formBuilder.group({
      serviceName: ['',[Validators.required]],
      area: ['',[Validators.required]],
      floorsNumber:['',[Validators.required]],
      maxPeople:['',[Validators.required]],
      rentType:['',[Validators.required]],
      status:['',[Validators.required]],
    })
  }

  createNewServices() {
    this.servicesService.addNewServices(this.formCreateNewServices.value).subscribe(data =>{
      this.router.navigateByUrl('services-list');
    })
  }


}
