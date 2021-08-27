import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'NameCard';
  countdownMsg = '';
  countdownAliasMsg = '';

  finishCountdown() {
    this.countdownMsg = 'Finished!'
  }

  onRateChange(value: number) {
    console.log(value)
  }
}
