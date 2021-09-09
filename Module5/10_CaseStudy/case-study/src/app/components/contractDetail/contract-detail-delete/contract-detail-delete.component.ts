import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ContractDeleteComponent} from "../../contract/contract-delete/contract-delete.component";
import {ContractDetailService} from "../../../service/contract-detail.service";

@Component({
  selector: 'app-contract-detail-delete',
  templateUrl: './contract-detail-delete.component.html',
  styleUrls: ['./contract-detail-delete.component.css']
})
export class ContractDetailDeleteComponent implements OnInit {

  // @ts-ignore
  public deleteContractDetailID;
  // @ts-ignore
  public contractDetailOfID;
  constructor(
    public dialogRef: MatDialogRef<ContractDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contractDetailService: ContractDetailService) {}

  ngOnInit(){
    this.deleteContractDetailID = this.data.data1.id;
    this.contractDetailOfID = this.data.data1.id;
  }

  deleteContractDetail() {
    this.contractDetailService.deleteContractDetailByID(this.contractDetailOfID).subscribe(
      data =>{
      this.dialogRef.close();
    });
  }

}
