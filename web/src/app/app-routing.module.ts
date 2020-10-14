import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BillsComponent} from './components/bills/bills.component';

const appRoutes: Routes = [
  {path: 'bills', component: BillsComponent},
  {path: '', redirectTo: '/bills', pathMatch: 'full'},
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
