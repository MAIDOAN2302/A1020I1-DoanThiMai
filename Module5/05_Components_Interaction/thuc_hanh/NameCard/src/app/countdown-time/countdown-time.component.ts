import {Component, Input, OnDestroy, OnInit} from '@angular/core';

@Component({
  selector: 'app-countdown-time',
  templateUrl: './countdown-time.component.html',
  styleUrls: ['./countdown-time.component.css']
})
export class CountdownTimeComponent implements OnInit, OnDestroy {
  private intervalId = 0;
  message = '';
  remainingTime: number | undefined;

  @Input()
  seconds = 11;

  clearTimer(){
    clearInterval(this.intervalId)
  }

  constructor() { }

  ngOnInit(){
    this.reset();
    this.start();
  }

  ngOnDestroy(){
    this.clearTimer();
  }
  start() {
    this.countDown();
    // @ts-ignore
    if (this.remainingTime <=0){
      this.remainingTime = this.seconds;
    }
  }
  stop(){
    this.clearTimer();
    this.message = `Holding at T-${this.remainingTime} seconds`;
  }
  reset(){
    this.clearTimer();
    this.remainingTime = this.seconds;
    this.message = 'Click start button to start the CountDown';
  }


  private countDown() {
    this.clearTimer();
    this.intervalId = window.setInterval(()=>{
      // @ts-ignore
      this.remainingTime-= 1;
      if (this.remainingTime === 0){
        this.message = 'Blast off';
        this.clearTimer();
      }else {
        this.message = `T-${this.remainingTime} seconds and counting`;
      }
    },1000)
  }
}
