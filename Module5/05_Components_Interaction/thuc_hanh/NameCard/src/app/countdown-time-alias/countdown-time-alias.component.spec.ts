import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountdownTimeAliasComponent } from './countdown-time-alias.component';

describe('CountdownTimeAliasComponent', () => {
  let component: CountdownTimeAliasComponent;
  let fixture: ComponentFixture<CountdownTimeAliasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountdownTimeAliasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CountdownTimeAliasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
