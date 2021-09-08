import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CommonModule} from "@angular/common";
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from "ngx-pagination";
import { EmployeeCreateComponent } from './components/employee/employee-create/employee-create.component';
import {MaterialModule} from "./material.module";
import { EmployeeDeleteComponent } from './components/employee/employee-delete/employee-delete.component';
import {MatDialogModule} from "@angular/material/dialog";
import { EmployeeEditComponent } from './components/employee/employee-edit/employee-edit.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './components/customer/customer-create/customer-create.component';
import { CustomerEditComponent } from './components/customer/customer-edit/customer-edit.component';
import { CustomerDeleteComponent } from './components/customer/customer-delete/customer-delete.component';
import { ServicesListComponent } from './components/services/services-list/services-list.component';
import { ServicesCreateComponent } from './components/services/services-create/services-create.component';
import { ServicesEditComponent } from './components/services/services-edit/services-edit.component';
import { ServicesDeleteComponent } from './components/services/services-delete/services-delete.component';
import { ContractListComponent } from './components/contract/contract-list/contract-list.component';
import { ContractCreateComponent } from './components/contract/contract-create/contract-create.component';
import { ContractEditComponent } from './components/contract/contract-edit/contract-edit.component';
import { ContractDeleteComponent } from './components/contract/contract-delete/contract-delete.component';
import { ContractDetailListComponent } from './components/contractDetail/contract-detail-list/contract-detail-list.component';
import { ContractDetailCreateComponent } from './components/contractDetail/contract-detail-create/contract-detail-create.component';
import { ContractDetailEditComponent } from './components/contractDetail/contract-detail-edit/contract-detail-edit.component';
import { ContractDetailDeleteComponent } from './components/contractDetail/contract-detail-delete/contract-detail-delete.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-create', component: EmployeeCreateComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent},

  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},

  {path: 'contract-list', component: ContractListComponent},
  {path: 'contract-create', component: ContractCreateComponent},
  {path: 'contract-edit/:id', component: ContractEditComponent},

  {path: 'contractDetail-list', component: ContractDetailListComponent},
  {path: 'contractDetail-create', component: ContractDetailCreateComponent},
  {path: 'contractDetail-edit/:id', component: ContractDetailEditComponent},

  {path: 'services-list', component: ServicesListComponent},
  {path: 'services-create', component: ServicesCreateComponent},
  {path: 'services-edit/:id', component: ServicesEditComponent},

  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    ReactiveFormsModule,
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    MaterialModule, MatDialogModule],
  exports: [RouterModule],
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,
    ServicesListComponent,
    ServicesCreateComponent,
    ServicesEditComponent,
    ServicesDeleteComponent,
    ContractListComponent,
    ContractCreateComponent,
    ContractEditComponent,
    ContractDeleteComponent,
    ContractDetailListComponent,
    ContractDetailCreateComponent,
    ContractDetailEditComponent,
    ContractDetailDeleteComponent
  ]
})
export class AppRoutingModule {
}
