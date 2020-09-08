import {Laptop} from './laptop.js'

export class Phone extends Laptop {
    color = 'black';

    getColor() {
        return this.color;
    }
}