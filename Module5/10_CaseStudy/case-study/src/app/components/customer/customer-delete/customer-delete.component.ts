import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CustomerService} from "../../../service/customer.service";

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  // @ts-ignore
  public deleteCustomerName;
  // @ts-ignore
  public customerOfID;
  constructor(
    public dialogRef: MatDialogRef<CustomerDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public customerService: CustomerService) {}

  ngOnInit(){
    this.deleteCustomerName = this.data.data1.fullName;
    this.customerOfID = this.data.data1.id;
  }

  deleteEmployee() {
    this.customerService.deleteCustomerByID(this.customerOfID).subscribe(data =>{
      this.dialogRef.close();
    });
  }

}
