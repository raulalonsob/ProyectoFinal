import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Cuenta from '../views/Cuenta.vue'
const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/presentacion',
    name: 'Presentacion',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    // component: () => import(/* webpackChunkName: "about" */ '../views/Presentacion.vue')
  },
  {
    path: '/cuenta',
    name: 'Cuenta',
    component: Cuenta,
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
