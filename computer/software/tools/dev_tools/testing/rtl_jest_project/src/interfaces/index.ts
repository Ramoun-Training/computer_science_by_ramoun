interface Product {
  id: string;
  name: string;
  price?: string;
  material?: string;
  description?: string;
  color?: string;
}

interface User {
  name: string;
  email: string;
}

export type { Product, User };
