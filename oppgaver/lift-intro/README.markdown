Oppgave: Lift - Intro
=====================

I denne oppgaven skal vi utvikle en enkel meldingsserver. Brukere skal kunne sende meldinger til en felles meldingsliste, som er tilgjengelig for alle brukere.

Ta utgangspunkt i det skjelettet av en Lift-applikasjon som allerede ligger her.

Ikke bli sittende fast for lenge - spør instruktøren. Husk, vi skal ha det gøy!

Mål
---
* Lage templates
* Lage snippets
* Ajax form
* Enkel input validering
* Konfigurere SiteMap
* Konfigurere opp snippets
* Lage en Comet actor

Del 1
-----
Start med å verifiser at applikasjonen kjører som forventet. I sbt, kjør `jetty-run`. Applikasjonen er tilgjengelig på `http://localhost:8080`

Det første vi skal gjøre er å sørge for at brukere må identifisere seg. Vi skal implementere en slags innlogging.

1. Lag en egen side hvor brukere skal identifisere seg, med tilhørende snippet. Brukere skal identifisere seg med et brukernavn (nick) og fullt navn. 
2. Konfigurer opp denne siden i SiteMap'et
3. Sørg for at man kun kan nå `/index` hvis man har identifisert seg

Tips:

* En bruker kan representeres med en case class
* Bruk en SessionVar for å holde på en bruker som har identifisert seg
* LocParam 

Del 2
-----
Nå skal vi utvikle meldingsutvekslingen. Vi tar utgangspunkt i `index.html`. Alt skal vises på denne siden. På siden trenger vi to deler:

* En Ajax form for å sende inn en ny melding
* En liste med innsendte meldinger

Vi må utvikle disse komponentene:

1. En snippet som håndterer Ajax formen for ny melding. Meldingen skal max inneholde 140 tegn. Denne snippeten skal sende meldingen videre til en LiftActor (punkt 2), som distribuerer meldingen ut til alle som lytter
2. En LiftActor som holder på alle meldingene og som Comet actors (punkt 3) kan abonnere på
3. En CometActor som lytter på meldinger fra LiftActor'en vår. Denne skal vise meldingene den får på `index.html`. Meldingslisten skal vise både hvem som sendte meldingen og teksten som ble sendt

Verifiser at alt fungerer som forventet ved å åpne to browsere og send meldinger.

Tips:

* S.error kan brukes til å vise feilmeldinger. Se i `templates-hidden/default.html`, der har vi satt opp visning av Lift notification meldinger allerede
* Representer kommunikasjon mellom actors med typesikre case classes 

Del 3 - Bonusoppgaver
---------------------
Her har dere noen ekstra nøtter å bryne dere på. Kan løses i hvilken som helst rekkefølge.

1. Vis kun de 10 siste meldingene i listen og vis de sortert etter nyeste øverst
2. Det skal være mulig å logge ut igjen. Vis på forsiden informasjon om innlogget/identifisert bruker og implementer funksjonalitet for å logge ut
3. Brukere skal kunne endre brukernavn. Dere kan gjenbruke identifiseringssiden. Hvis en bruker endrer brukernavn skal det sendes en notifikasjon til meldingsserveren. Dette skal vises til de andre brukerne i meldingslisten
4. Når en bruker logger inn skal de andre brukerne få beskjed om dette. Dette skal vises til de andre brukerne i meldingslisten
5. Vi har gått i den vanlige fella med å hardkode norsk strenger i koden vår. Nå er det snakk om World Domination, og vi trenger internasjonlisering. Implementer i18n støtte. 
7. En "liten" nøtt til slutt: Implementer chat rooms
