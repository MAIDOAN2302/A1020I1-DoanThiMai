import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ContractDetailService} from "../../../service/contract-detail.service";

@Component({
  selector: 'app-contract-detail-create',
  templateUrl: './contract-detail-create.component.html',
  styleUrls: ['./contract-detail-create.component.css']
})
export class ContractDetailCreateComponent implements OnInit {
// @ts-ignore
  public formCreateNewContractDetail: FormGroup;

  constructor(public formBuilder: FormBuilder,
              public contractDetailService: ContractDetailService,
              public router: Router) { }

  ngOnInit(){
    this.formCreateNewContractDetail = this.formBuilder.group({
      idContract: ['',[Validators.required]],
      idService: ['',[Validators.required]],
      quantity:['',[Validators.required]],
    })
  }

  createNewContractDetail() {
    this.contractDetailService.addNewContractDetail(this.formCreateNewContractDetail.value).subscribe(
      data =>{
      this.router.navigateByUrl('contractDetail-list');
    })
  }
}
