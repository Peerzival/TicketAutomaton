# TicketAutomaton

Prüfungsleistung für die Vorlesung "Komponentenorientierte Softwarearchitektur".

Aufgabe:
Das Projekt „TicketAutomaton“ soll die Komponenten DocumentSystem, PrintingSystem, MessagingSystem sowie RouteSystem und PricingSystem enthalten. 
Diese Komponenten sollen gekoppelt werden in dem ein ComponentBus mit OSGi (Equinox oder Felix oder andere) implementiert wird. 
Die Komponenten sind lose über einen Event-Delegation Mechanismus gekoppelt. Das Design soll in Form eines UML Komponentdiagrammes beschrieben werden.
Der „TicketAutomaton“ bietet über ein Comand-Line-Interface (CLI) an sowohl Start- und Zielort als auch eine Preisgruppe auszuwählen.
Nach Auswahl eines in der Liste vorhandenen Startortes werden dazu mögliche Zieleorte genannt. Nachdem die Route (Startort, Zielort) ausgewählt wurde, 
muss eine Preisgruppe festgelegt werden. Es sollen die Preisgruppen Normal-Tarif, GünstigerReisen-Tarif, Schnäppchen-Tarif angeboten werden. 
Der GünstigerReisen-Tarif entspricht 75% des Normal-Tarif, der Schnäppchen-Tarif entspricht 50% des Normal-Tarifs. 
Jeder Fahrtkilometer kostet im Normaltarif 0,03 Euro. Die Route in Kilometern entspricht der direkten Luftlinie in Kilometern * 1,45.
Die Ausgabe auf der Console nach ausgewählter Route und Preisgruppe basiert auf einem TicketDocumentTemplate pro Preisgruppe und enthält 
neben der Preisgruppe, das aktuelle Datum, die Route und den Gesamtpreis sowie die Fahrtkilometer. Nach Ausgabe auf der Console wird eine Nachricht
über den getätigten Ticketkauf verschickt und die Ticketkaufinformation einer Log-Datei festgehalten. 
Pro Komponente gibt es mindestens einen Modultest in Form eines JUnit-Tests.
