import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {ContractDetailService} from "../../../service/contract-detail.service";
import {ContractDetailDeleteComponent} from "../contract-detail-delete/contract-detail-delete.component";

@Component({
  selector: 'app-contract-detail-list',
  templateUrl: './contract-detail-list.component.html',
  styleUrls: ['./contract-detail-list.component.css']
})
export class ContractDetailListComponent implements OnInit {

  public contractDetails: any;
  term: any;
  p: any;

  constructor(
    public contractDetailService: ContractDetailService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.contractDetailService.getAllContractDetails().subscribe(data => {
      this.contractDetails = data;
      console.log(this.contractDetails);
    })
  }

  // @ts-ignore
  openDialog(contractDetailID): void {
    this.contractDetailService.getContractDetailById(contractDetailID).subscribe(
      dataOfContractDetail => {
      const dialogRef = this.dialog.open(ContractDetailDeleteComponent, {
        width: '500px',
        data: {data1: dataOfContractDetail},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }

}
