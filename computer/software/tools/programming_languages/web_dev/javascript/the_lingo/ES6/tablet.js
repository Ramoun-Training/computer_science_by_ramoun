import {Phone} from './phone.js'

export class Tabet extends Phone {
    constructor(model, year, company, os) {
        super(model, year, company);
        this.os = os;
    }
}