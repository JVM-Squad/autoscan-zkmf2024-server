import {Component, OnInit} from '@angular/core';
import {MenuItem, PrimeNGConfig} from "primeng/api";
import {APP_ROUTE, ERRATA_ROUTE, HELFER_ROUTE, JURY_ROUTE, NEWSLETTER_ROUTE, TIMETABLE_ROUTE, VEREINE_ROUTE} from "./app-routing.module";
import {AuthenticationService} from "./service/authentication.service";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit {

    items: MenuItem[] = [];

    constructor(private primengConfig: PrimeNGConfig,
                private authenticationService: AuthenticationService) {
    }

    ngOnInit() {
        this.primengConfig.ripple = true;

        this.items = [
            {label: 'Vereine', routerLink: `/${VEREINE_ROUTE}`},
            {label: 'App', routerLink: `/${APP_ROUTE}`},
            {label: 'Zeitplan', routerLink: `/${TIMETABLE_ROUTE}`},
            {label: 'Errata', routerLink: `/${ERRATA_ROUTE}`},
            {label: 'Jury', routerLink: `/${JURY_ROUTE}`},
            {label: 'Helfer', routerLink: `/${HELFER_ROUTE}`},
            {label: 'Newsletter', routerLink: `/${NEWSLETTER_ROUTE}`},
            // {label: 'Users', routerLink: '/' + USERS_ROUTE},
        ]
    }

    loggedIn(): boolean {
        return this.authenticationService.isLoggedIn();
    }

}
