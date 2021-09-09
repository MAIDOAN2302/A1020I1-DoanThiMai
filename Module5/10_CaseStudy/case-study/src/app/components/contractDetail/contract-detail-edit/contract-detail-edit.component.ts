import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {ContractDetailService} from "../../../service/contract-detail.service";

@Component({
  selector: 'app-contract-detail-edit',
  templateUrl: './contract-detail-edit.component.html',
  styleUrls: ['./contract-detail-edit.component.css']
})
export class ContractDetailEditComponent implements OnInit {

  // @ts-ignore
  public formEditContractDetail: FormGroup;
  // @ts-ignore
  public contractDetailOfId;
  constructor(public formBuilder: FormBuilder,
              public contractDetailService: ContractDetailService,
              public router: Router,
              public activatedRouter: ActivatedRoute) { }

  ngOnInit(){
    this.formEditContractDetail = this.formBuilder.group({
      id: ['',[Validators.required]],
      idContract: ['',[Validators.required]],
      idService: ['',[Validators.required]],
      quantity: ['',[Validators.required]],
    });
    this.activatedRouter.params.subscribe(data =>{
      this.contractDetailOfId = data.id;
      this.contractDetailService.getContractDetailById(this.contractDetailOfId).subscribe(
        data =>{
        this.formEditContractDetail.patchValue(data);
      })
    })
  }
  editContractDetail() {
    this.contractDetailService.editContractDetail(this.formEditContractDetail.value, this.contractDetailOfId).subscribe(
      data => {
        this.router.navigateByUrl('contractDetail-list');
      })
  }
}
