export class Laptop {
    constructor(model, year, company) {
        this.model = model;
        this.year = year;
        this.company = company;
    }

    getInfo() {
        return `model:${this.model}, year:${this.year}, company: ${this.company}`;
    }
}
