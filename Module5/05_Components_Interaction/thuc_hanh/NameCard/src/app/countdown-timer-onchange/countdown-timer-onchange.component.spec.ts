import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountdownTimerOnchangeComponent } from './countdown-timer-onchange.component';

describe('CountdownTimerOnchangeComponent', () => {
  let component: CountdownTimerOnchangeComponent;
  let fixture: ComponentFixture<CountdownTimerOnchangeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountdownTimerOnchangeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CountdownTimerOnchangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
