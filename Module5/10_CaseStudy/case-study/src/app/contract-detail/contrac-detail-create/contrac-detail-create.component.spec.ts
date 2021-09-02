import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContracDetailCreateComponent } from './contrac-detail-create.component';

describe('ContracDetailCreateComponent', () => {
  let component: ContracDetailCreateComponent;
  let fixture: ComponentFixture<ContracDetailCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContracDetailCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContracDetailCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
