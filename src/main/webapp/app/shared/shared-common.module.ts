import { NgModule } from '@angular/core';

import { CinepagoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [CinepagoSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [CinepagoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class CinepagoSharedCommonModule {}
