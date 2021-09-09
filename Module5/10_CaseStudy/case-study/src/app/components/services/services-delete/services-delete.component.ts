import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ServicesService} from "../../../service/services.service";

@Component({
  selector: 'app-services-delete',
  templateUrl: './services-delete.component.html',
  styleUrls: ['./services-delete.component.css']
})
export class ServicesDeleteComponent implements OnInit {
// @ts-ignore
  public deleteServicesID;
  // @ts-ignore
  public servicesOfID;
  constructor(
    public dialogRef: MatDialogRef<ServicesDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public servicesService: ServicesService) {}

  ngOnInit(){
    this.deleteServicesID = this.data.data1.id;
    this.servicesOfID = this.data.data1.id;
  }

  deleteServices() {
    this.servicesService.deleteServicesByID(this.servicesOfID).subscribe(data =>{
      this.dialogRef.close();
    });
  }


}
