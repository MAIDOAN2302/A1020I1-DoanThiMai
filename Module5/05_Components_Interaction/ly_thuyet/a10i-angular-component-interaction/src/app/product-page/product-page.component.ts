import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-page',
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.css']
})
export class ProductPageComponent implements OnInit {

  public products = new Array();
  title = 'Products';
  productToUpdate: any;

  ngOnInit() {
    this.products = this.getProducts();
  }

  getProducts() {
    return [
      {id: 'PR-232', title: 'Screw Driver', price: 400, stock: 11},
      {id: 'PR-986', title: 'Nut Volt', price: 200, stock: 5},
      {id: 'PR-123', title: 'Resistor', price: 78, stock: 45},
      {id: 'PR-555', title: 'Tractor', price: 20000, stock: 1},
      {id: 'PR-333', title: 'Roller', price: 62, stock: 15},
      // {id: 'PR-123', title: 'Resistor', price: 78, stock: 45}
    ];
  }

  changeStockValue(p: any) {
    this.productToUpdate = this.products.find(
      elementProduct => elementProduct.id === p.id);
    this.productToUpdate.stock += p.updatedStockValue;
  }

}
