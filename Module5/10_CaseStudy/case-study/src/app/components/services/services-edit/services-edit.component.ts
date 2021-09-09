import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../../service/contract.service";
import {ActivatedRoute, Router} from "@angular/router";
import {ServicesService} from "../../../service/services.service";

@Component({
  selector: 'app-services-edit',
  templateUrl: './services-edit.component.html',
  styleUrls: ['./services-edit.component.css']
})
export class ServicesEditComponent implements OnInit {

  // @ts-ignore
  public formEditServices: FormGroup;
  // @ts-ignore
  public servicesOfId;
  constructor(public formBuilder: FormBuilder,
              public servicesService: ServicesService,
              public router: Router,
              public activatedRouter: ActivatedRoute) { }

  ngOnInit(){
    this.formEditServices = this.formBuilder.group({
      serviceName: ['',[Validators.required]],
      area: ['',[Validators.required]],
      floorsNumber:['',[Validators.required]],
      maxPeople:['',[Validators.required]],
      rentType:['',[Validators.required]],
      status:['',[Validators.required]],
    });
    this.activatedRouter.params.subscribe(data =>{
      this.servicesOfId = data.id;
      this.servicesService.getServicesById(this.servicesOfId).subscribe(data =>{
        this.formEditServices.patchValue(data);
      })
    })
  }
  editServices() {
    this.servicesService.editServices(this.formEditServices.value, this.servicesOfId).subscribe(
      data => {
        this.router.navigateByUrl('services-list');
      })
  }
}
