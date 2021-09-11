import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {CustomerService} from "../../../service/customer.service";
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {ICustomer} from "../../../models/customer";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  // @ts-ignore
  public customers: ICustomer[];
  term: any;
  p: any;
  // @ts-ignore
  nameSearch='';

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) { }

  ngOnInit(){
    this.customerService.getAllCustomers().subscribe(data =>{
      this.customers = data;
    })
  }
  // @ts-ignore
  openDialog(idCustomer):void {
    this.customerService.getCustomerById(idCustomer).subscribe(dataOfCustomer=>{
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        data: {data1: dataOfCustomer},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  };
  search() {
    this.customerService.search(this.nameSearch).subscribe(data=>{
      // @ts-ignore
      this.customers =data
    })
  }
}
