import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContractListComponent } from './contract-list/contract-list.component';
import { ContractDetailComponent } from './contract-detail/contract-detail.component';
import { ContractCreateComponent } from './contract-create/contract-create.component';
import { ContractEidtComponent } from './contract-eidt/contract-eidt.component';



@NgModule({
  declarations: [
    ContractListComponent,
    ContractDetailComponent,
    ContractCreateComponent,
    ContractEidtComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ContractModule { }
