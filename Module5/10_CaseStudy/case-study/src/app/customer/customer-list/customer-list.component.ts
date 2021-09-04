import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../model/customer";
import {CustomerService} from "../customer.service";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customerList!: ICustomer[];
  message! : String;

  constructor(private customerService: CustomerService) {
    customerService.findAll().subscribe(
      next => this.customerList = next,
      error => this.customerList = [],
    );
  }

  ngOnInit(): void {
    this.message = this.customerService.message;
  }

}
