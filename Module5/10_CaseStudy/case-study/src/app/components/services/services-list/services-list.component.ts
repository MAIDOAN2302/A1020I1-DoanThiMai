import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {ContractDeleteComponent} from "../../contract/contract-delete/contract-delete.component";
import {ServicesService} from "../../../service/services.service";
import {ServicesDeleteComponent} from "../services-delete/services-delete.component";

@Component({
  selector: 'app-services-list',
  templateUrl: './services-list.component.html',
  styleUrls: ['./services-list.component.css']
})
export class ServicesListComponent implements OnInit {

  public services: any;
  term: any;
  p: any;

  constructor(
    public servicesService: ServicesService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.servicesService.getAllServices().subscribe(data => {
      this.services = data;
      console.log(this.services);
    })
  }

  // @ts-ignore
  openDialog(servicesID): void {
    this.servicesService.getServicesById(servicesID).subscribe(dataOfServices => {
      const dialogRef = this.dialog.open(ServicesDeleteComponent, {
        width: '500px',
        data: {data1: dataOfServices},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
