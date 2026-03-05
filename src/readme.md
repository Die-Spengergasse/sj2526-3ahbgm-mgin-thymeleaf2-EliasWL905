# Autohaus Manager

Verwaltet eine Liste von fahrzeugen in einem Autohaus. Ermöglicht das Hinzufügen, Bearbeiten und Löschen von Fahrzeugen über eine Weboberfläche.



## Starten über:

```
  SpringThymeleafApplication.java 
```

Die Anwendung ist danach unter `http://localhost:8080` erreichbar.

## Funktionen

| Route | Beschreibung |
|---|---|
| `/` | Startseite |
| `/autohausmanager/list` | Alle Fahrzeuge anzeigen |
| `/autohausmanager/add` | Neues Fahrzeug hinzufuegen |
| `/autohausmanager/edit?id=` | Fahrzeug bearbeiten |
| `/autohausmanager/delete?id=` | Fahrzeug loeschen |

## Projektstruktur

```
src/main/
├── java/at/spengergasse/spring_thymeleaf/
│   ├── controllers/
│   │   ├── AutohausController.java   
│   │   └── HelloController.java      
│   └── entities/
│       ├── Autohaus.java             
│       └── AutohausRepository.java   
└── resources/
    ├── templates/                   
    ├── static/design.css             
    └── application.properties        
