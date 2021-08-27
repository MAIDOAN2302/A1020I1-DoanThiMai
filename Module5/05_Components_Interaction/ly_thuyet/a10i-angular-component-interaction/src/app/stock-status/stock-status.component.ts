import {Component, EventEmitter, Input, OnChanges, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-stock-status',
  templateUrl: './stock-status.component.html',
  styleUrls: ['./stock-status.component.css']
})
export class StockStatusComponent implements OnInit, OnChanges {

  @Input() stock: number = 0;
  @Input() productId: number = 0;
  @Output() stockValueChange = new EventEmitter();
  public color = '';
  public updatedStockValue: number = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  stockValueChanged() {
    this.stockValueChange.emit({id: this.productId,
      updatedStockValue: this.updatedStockValue});
    this.updatedStockValue = 0;
  }

  ngOnChanges() {
    if (this.stock > 10) {
      this.color = 'green';
    } else {
      this.color = 'red';
    }
  }

}
