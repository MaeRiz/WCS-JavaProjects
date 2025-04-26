# Projet : Agence de voyage

## Présentation
Cette application Java simule une agence de voyage. Elle permet de :

- gérer une liste de voyages (vols, croisières, road trips),
- enregistrer des clients et leurs réservations,
- suivre les disponibilités des voyages.

Ton objectif est d'identifier et de corriger des erreurs intégrées pour rendre cette application fonctionnelle. Cela t'aidera à renforcer ta compréhension des concepts de la POO : **encapsulation**, **héritage**, **polymorphisme**, **abstraction** et **interfaces**.

## Fichiers principaux

- **`TravelAgency`** : Gère les voyages et les clients.
- **`Trip`** : Classe abstraite pour les voyages.
  - **`FlightTrip`**, **`CruiseTrip`**, **`RoadTrip`** : Types spécifiques de voyages.
- **`Customer`** : Représente un client.
- **`Reservable`** : Interface pour les objets réservables.

## Fonctionnalités principales

1. **Ajouter des voyages** : permet d'ajouter différents types de voyages à l'agence.
2. **Lister les voyages disponibles** : permet d'afficher les détails des voyages.
3. **Réserver des voyages** : Les clients peuvent réserver s'il reste des places.

## Comment exécuter

1. Compile tout :
   ```
   javac *.java
   ```
2. Lance le programme :
   ```
   java TravelAgency
   ```


Résultat attendu dans le terminal

Après débogage, le programme affichera un résultat similaire à :

```shell
Available Trips:
Flight to Paris | Price: $200.0 | Airline: Air France | International: Yes | Seats left: 100
Cruise to Caribbean | Price: $500.0 | Cabins: 20 | Pool: Yes | Seats left: 50
Road Trip to Grand Canyon | Price: $300.0 | Duration: 5 days | Guide included: Yes | Seats left: 10

John's reservations: 
Flight to Paris | Price: $200.0 | Airline: Air France | International: Yes | Seats left: 99
```



## Objectifs

- Comprendre les bases de la POO en Java.
- Développer tes compétences en débogage.
- Étendre les fonctionnalités d'une application.

## Ressources

- [Java Docs](https://docs.oracle.com/en/java/)
- [Interfaces en Java](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)

