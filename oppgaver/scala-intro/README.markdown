Oppgaver: Scala - Intro
=====================

I disse oppgavene skal vi utforske noen grunnleggende konsepter i Scala. Vi skal bli kjent med litt syntax, og jobbe med klasser, objekter, traits, og collection rammeverket. 

Ikke bli sittende fast for lenge - spør instruktøren. Husk, vi skal ha det gøy!

Oppgave 1 - Klasser, traits og objekter
-----
I denne oppgaven skal vi se på Scala's støtte for objekt-orientering. Vi skal definere klasser, gjøre komposisjon med traits, og definere companion objects. For dette skal vi utvikle en representasjon av en person, som hilser til alle som spør. Personen vil hilse mer vennlig til vennene sine.

Start med å verifiser at du får startet sbt og kjørt tester som forventet. 

1) Start sbt med start-scriptet som ligger i roten av oppgaven. 
2) Foreløpig vil ingen tester kjøre grønt, men sjekk med `test-only oppgave1.Oppgave1`. 

Nå skal vi gradvis implementere alt som skal til for å få alle testene i `oppgave1.Oppgave1` til å kjøre grønt. Foreløpig er kun en av testene kommentert inn. Følg instruksene som ligger i testklassen.

Tips:

* Kommenter kun inn en og en test 
* Se på slidene dere har fått utdelt

Diskusjonspunkter:

* Hvordan ville man gjort dette i Java?
* ... 

Oppgave 2 - Lister
-----
I denne oppgaven skal vi utforske Scala's rike collection rammeverk. Som en del av dette skal vi jobbe med higher-order functions; funksjoner som tar funksjoner. Vi skal lete etter "idiomatiske" løsninger på problemene. Collection-rammeverket har mye å by på, og det er ofte en enklere måte å løse problemet på enn du kanskje ført anntar.

Vi skal ta utgangspunkt i et sett av tester, som dessverre ikke kjører som de skal. 

1) Testene kan kjøres med `test-only oppgave2.Lister`
2) Løs oppgavene som er definert i oppgave2.Lister

Tips:

* I hver test ligger det en imperativ variant av løsningen
* http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List

Oppgave 3 - For Comprehensions
-----
Nå skal vi se på Scala's for expression, kalt for comprehensions. Dette er en rikere variant enn Java's, som i praksis vil kunne brukes for samme resultat som flatMap.

Vi beveger oss inn i matematikkens verden, og skal løse et problem basert på Pytagoras 
