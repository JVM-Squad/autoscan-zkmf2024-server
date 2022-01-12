/* eslint-disable */

export interface ChangePasswordRequestDTO {
    oldPassword: string;
    newPassword: string;
}

export interface HelperRegistrationDTO {
    id: number;
    name: string;
    email: string;
    availableFriday: boolean;
    availableSaturday: boolean;
    availableSunday: boolean;
    comment?: string;
}

export interface LoginRequestDTO {
    email: string;
    password: string;
}

export interface LoginResponseDTO {
    email: string;
    role: UserRole;
    jwt: string;
}

export interface NewsletterRecipientDTO {
    name: string;
    email: string;
    subscribedAt: Date;
    unsubscribedAt?: Date;
}

export interface RegisterHelperRequestDTO {
    name: string;
    email: string;
    comment: string;
    checkedDays: EventDays[];
}

export interface RegisterNewsletterRequestDTO {
    name: string;
    email: string;
}

export interface RegisterRequestDTO {
    email: string;
    password: string;
    name: string;
    contactFirstName: string;
    contactLastName: string;
}

export interface SurveyAnswerDTO {
    id?: number;
    vereinsName: string;
    besetzung: string;
    staerkeKlasse: string;
    anzahlMitglieder: string;
    kontaktName: string;
    kontaktEmail: string;
    kontaktTelefon: string;
    modulAuswahl: string[];
    absageKommentar?: string;
    absageKontaktaufnahme?: string;
    helfer?: string;
}

export enum UserRole {
    BAND = "BAND",
    HELPER = "HELPER",
    PLANER = "PLANER",
    ADMIN = "ADMIN",
}

export enum EventDays {
    FRIDAY = "FRIDAY",
    SATURDAY = "SATURDAY",
    SUNDAY = "SUNDAY",
}