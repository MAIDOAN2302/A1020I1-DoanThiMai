import {Component, OnInit} from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {ContractService} from "../../../service/contract.service";
import {ContractDeleteComponent} from "../contract-delete/contract-delete.component";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  public contracts: any;
  term: any;
  p: any;

  constructor(
    public contractService: ContractService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.contractService.getAllContracts().subscribe(data => {
      this.contracts = data;
      console.log(this.contracts);
    })
  }

  // @ts-ignore
  openDialog(contractID): void {
    this.contractService.getContractById(contractID).subscribe(dataOfContract => {
      const dialogRef = this.dialog.open(ContractDeleteComponent, {
        width: '500px',
        data: {data1: dataOfContract},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
