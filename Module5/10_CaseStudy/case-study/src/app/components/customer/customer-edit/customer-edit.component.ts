import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {CustomerService} from "../../../service/customer.service";
import {CustomerTypeService} from "../../../service/customer-type.service";
import {ICustomerType} from "../../../models/customerType";
import {ICustomer} from "../../../models/customer";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  // @ts-ignore
  public formEditCustomer: FormGroup;
  // @ts-ignore
  public customerTypes: ICustomerType[];

  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);
  // @ts-ignore
  public customerOfId;
  constructor(public formBuilder: FormBuilder,
              public customerService: CustomerService,
              public customerTypeService: CustomerTypeService,
              public router: Router,
              public activatedRouter: ActivatedRoute) { }

  ngOnInit(){
    this.customerTypeService.getAllCustomerType().subscribe(data => {
      this.customerTypes = data;
    });
    this.formEditCustomer = this.formBuilder.group({
      idCustomer: ['', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]],
      customerType: ['', [Validators.required]],
      fullName: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern(/^\d{9}|\d{12}$/)]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern(
        /^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$/)]],
      address: ['', [Validators.required]],
    });
    this.activatedRouter.params.subscribe(data =>{
      this.customerOfId = data.id;
      this.customerService.getCustomerById(this.customerOfId).subscribe(data =>{
        this.formEditCustomer.patchValue(data);
      });
    });
  };
  editCustomer() {
    this.customerService.editCustomer(this.formEditCustomer.value,this.customerOfId).subscribe(data=>{
      this.router.navigateByUrl('customer-list');
    });
  };
  // @ts-ignore
  compareWith(c1, c2): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
}
