import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, FormArray} from '@angular/forms';

@Component({
  selector: 'app-bills',
  templateUrl: './bills.component.html',
  styleUrls: ['./bills.component.css']
})

export class BillsComponent implements OnInit {
  payersGroup: FormGroup;
  payerNameInput = ' ';

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.payersGroup = this.fb.group({
      payers: this.fb.array([])
    });
  }

  /*
  *  payers functions
  * */
  payers(): FormArray {
    return this.payersGroup.get('payers') as FormArray;
  }

  removePayer(payIndex: number): void {
    this.payers().removeAt(payIndex);
  }

  createPayerFormGroup(name: string): FormGroup {
    return this.fb.group({
      payerName: name,
      bills: this.fb.array([])
    });
  }

  /*
  *
  *  bills functions
  * */
  payerBills(payIndex: number): FormArray {
    return this.payers().at(payIndex).get('bills') as FormArray;
  }

  removePayerBill(payIndex: number, billIndex: number): void {
    this.payerBills(payIndex).removeAt(billIndex);
  }

  createPayerBillsGroup(bill: string): FormGroup {
    return this.fb.group({
      value: bill
    });
  }

  /*
  *
  *  buttons action
  * */
  addPayersButtonClick(name: string): void {
    this.payers().push(this.createPayerFormGroup(name));
    this.payerNameInput = '';
  }

  addBillButtonClick(payIndex: number, bill: string): void {
    this.payerBills(payIndex).push(this.createPayerBillsGroup(bill));
  }

  onSubmit($event: any): void {
    console.log(this.payersGroup.value);
  }

}
