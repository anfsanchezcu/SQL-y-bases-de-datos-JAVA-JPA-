package org.example;

import javax.persistence.EntityManager;

import org.example.entity.Employee;
import org.example.util.UtilEntity;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager em  = UtilEntity.getEntityManager();
        /*List<Employee> listEmployees;
        listEmployees =   em.createQuery("SELECT e from Employee e", Employee.class).getResultList();
        System.out.println("---");
        listEmployees.forEach(System.out::println);*/


        /*System.out.println("-----------buscar uno-------");
        int employeeId = 16;
        Employee employee = em.find(Employee.class, employeeId);
        System.out.println("Empleado encontrado" +employee);*/

       /* System.out.println("-------------------Crea UNO--------------------");
        Employee employee2 = new Employee();
        employee2.setFirstName("Paola");
        employee2.setMaSurname("Cuatindioy");
        employee2.setPaSurname("Sanchez");
        employee2.setEmail("pao@unal,edu,co");
        employee2.setSalary(4000F);

        em.getTransaction().begin();
        em.persist(employee2);
        em.getTransaction().commit();

        System.out.println("nuevo empleado creado");*/

        /*System.out.println("----ACTUALIZAR------");
        int employeeToUpdateId = 2;
        Employee employee = em.find(Employee.class, employeeToUpdateId);
        System.out.println("emploeado a modicficar:" +employee);

        employee.setEmail("updated.example.com");
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();

        System.out.println("actualizado: "+ employee);*/


        System.out.println("---DELETE----");
        int toDelete= 18;
        Employee employee = em.find(Employee.class, toDelete);

        em.getTransaction().begin();
        em.remove(employee);
        em.getTransaction().commit();
        em.close();

    }
}