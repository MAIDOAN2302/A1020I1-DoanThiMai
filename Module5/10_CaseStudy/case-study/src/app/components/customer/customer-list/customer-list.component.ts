import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {CustomerService} from "../../../service/customer.service";
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  public customers: any;
  term: any;
  p: any;

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) { }

  ngOnInit(){
    this.customerService.getAllCustomers().subscribe(data =>{
      this.customers = data;
      console.log(this.customers);
    })
  }

  // @ts-ignore
  openDialog(customerID):void {
    this.customerService.getCustomerById(customerID).subscribe(dataOfCustomer=>{
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        data: {data1: dataOfCustomer},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
