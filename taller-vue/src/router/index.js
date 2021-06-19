import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Cuenta from '../views/Cuenta.vue'
import Gestion from '../views/Gestion.vue'
import Contacto from '../views/Contacto.vue'
const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/contacto',
    name: 'Contacto',
    component: Contacto,

  },
  {
    path: '/cuenta',
    name: 'Cuenta',
    component: Cuenta,
  },
  {
    path: '/gestion',
    name: 'Gestion',
    component: Gestion,
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
