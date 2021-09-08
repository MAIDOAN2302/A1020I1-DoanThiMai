import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {CustomerService} from "../../../service/customer.service";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  // @ts-ignore
  public formCreateNewCustomer: FormGroup;
  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);

  constructor(public formBuilder: FormBuilder,
              public customerService: CustomerService,
              public router: Router) { }

  ngOnInit() {
    this.formCreateNewCustomer = this.formBuilder.group({
      id: ['', [Validators.required]],
      customerType: ['', [Validators.required]],
      fullName: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[\\d]{9}$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern(
        '^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]],
    })
  }
  createNewCustomer() {
    this.customerService.addNewCustomer(this.formCreateNewCustomer.value).subscribe(data =>{
      this.router.navigateByUrl('customer-list');
    })
  }
}
