import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhipsterSampleApplicationSharedModule } from 'app/shared';
import {
  BookEntityComponent,
  BookEntityDetailComponent,
  BookEntityUpdateComponent,
  BookEntityDeletePopupComponent,
  BookEntityDeleteDialogComponent,
  bookEntityRoute,
  bookEntityPopupRoute
} from './';

const ENTITY_STATES = [...bookEntityRoute, ...bookEntityPopupRoute];

@NgModule({
  imports: [JhipsterSampleApplicationSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    BookEntityComponent,
    BookEntityDetailComponent,
    BookEntityUpdateComponent,
    BookEntityDeleteDialogComponent,
    BookEntityDeletePopupComponent
  ],
  entryComponents: [BookEntityComponent, BookEntityUpdateComponent, BookEntityDeleteDialogComponent, BookEntityDeletePopupComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterSampleApplicationBookEntityModule {}
