import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractDeleteComponent } from './contract-delete.component';

describe('ContractDeleteComponent', () => {
  let component: ContractDeleteComponent;
  let fixture: ComponentFixture<ContractDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
