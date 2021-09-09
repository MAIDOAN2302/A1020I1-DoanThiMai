import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ContractService} from "../../../service/contract.service";

@Component({
  selector: 'app-contract-delete',
  templateUrl: './contract-delete.component.html',
  styleUrls: ['./contract-delete.component.css']
})
export class ContractDeleteComponent implements OnInit {
// @ts-ignore
  public deleteContractID;
  // @ts-ignore
  public contractOfID;
  constructor(
    public dialogRef: MatDialogRef<ContractDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contractService: ContractService) {}

  ngOnInit(){
    this.deleteContractID = this.data.data1.id;
    this.contractOfID = this.data.data1.id;
  }

  deleteContract() {
    this.contractService.deleteContractByID(this.contractOfID).subscribe(data =>{
      this.dialogRef.close();
    });
  }

}
