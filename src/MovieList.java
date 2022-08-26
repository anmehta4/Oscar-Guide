// --== CS400 File Header Information ==--
// Name: Arnav Mehta / Sankalp
// Email: anmehta4@wisc.edu
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * 
 * @author Sankalp and Arnav - An interface that create Movies objects for all the Oscar winning movies for the
 *         period 1928 - 2020. Note: 1933 - there was no Oscar winning movie as it was a single
 *         winner for the year 1933 and 1934.
 *
 */
public interface MovieList {
  public static Movies For1928 = new Movies("Wings",
      "Two young men, one rich, "
          + "one middle class, who are in love with the same woman, become fighter"
          + " pilots in World War I.",
      "Clara Bow, Charles Rogers, Richard Arlen," + " and Gary Cooper.", 1928);

  public static Movies For1929 = new Movies("The Broadway Melody",
      "A pair of" + " sisters from the vaudeville circuit try to make it big time on "
          + "Broadway, but matters of the heart complicate the attempt.",
      "Bessie " + "Love, Anita Page, and Charles King.", 1929);

  public static Movies For1930 = new Movies("All Quiet on the Western Front",
      "A young soldier faces profound disillusionment in the soul-destroying "
          + "horror of World War I.",
      "Lew Ayres, Louis Wolheim, and John Wray.", 1930);

  public static Movies For1931 = new Movies("Cimarron",
      "A newspaper editor "
          + "settles in an Oklahoma boomtown with his reluctant wife at the end of"
          + " the nineteenth century.",
      "Richard Dix, Irene Dunne, and Estelle Taylor.", 1931);

  public static Movies For1932 = new Movies("Grand Hotel",
      "A group of very " + "different individuals staying at a luxurious hotel in Berlin deal "
          + "with each of their respective dramas.",
      "Greta Garbo, John Barrymore," + " and Joan Crawford.", 1932);

  public static Movies For1934 = new Movies("Cavalcade",
      "A cavalcade of English"
          + " life from New Year's Eve 1899 until 1933 seen through the eyes of "
          + "well-to-do Londoners Jane and Robert Marryot.",
      "Diana Wynyard, " + "Clive Brook, and Una O'Connor.", 1934);

  public static Movies For1935 = new Movies("It Happened One Night",
      "A " + "spoiled heiress running away from her family is helped by a man who "
          + "is actually a reporter in need of a story.",
      "Clark Gable, Claudette " + "Colbert, and Walter Connolly.", 1935);

  public static Movies For1936 = new Movies("Mutiny on the Bounty",
      "Midshipman" + " Roger Byam joins Captain Bligh and Fletcher Christian aboard HMS "
          + "Bounty for a voyage to Tahiti. Bligh proves to be a brutal tyrant and,"
          + " after six pleasant months on Tahiti, Christian leads the crew to "
          + "mutiny on the homeward voyage.",
      "Charles Laughton, Clark Gable, and " + "Franchot Tone.", 1936);

  public static Movies For1937 = new Movies("The Great Ziegfeld",
      "The ups and " + "downs of Florenz Ziegfeld Jr., famed producer of extravagant stage "
          + "revues, are portrayed.",
      "William Powell, Myrna Loy, and Luise Rainer.", 1937);

  public static Movies For1938 = new Movies("The Life of Emile Zola",
      "The " + "biopic of the famous French muckraking writer and his involvement in "
          + "fighting the injustice of the Dreyfuss Affair.",
      "Paul Muni, Gale " + "Sondergaard, and Joseph Schildkraut.", 1938);

  public static Movies For1939 = new Movies("You Can't Take It With You",
      "A" + " man from a family of rich snobs becomes engaged to a woman from a "
          + "good-natured but decidedly eccentric family.",
      "Jean Arthur, James " + "Stewart, and Lionel Barrymore.", 1939);

  public static Movies For1940 = new Movies("Gone with the Wind",
      "A manipulative " + "Southern belle carries on a turbulent affair with a blockade runner "
          + "during the American Civil War.",
      "Clark Gable, Vivien Leigh, and Thomas Mitchell.", 1940);

  public static Movies For1941 = new Movies("Rebecca",
      "A self-conscious bride is tormented by the memory of her husband's dead first wife.",
      "Laurence Olivier, Joan Fontaine, and George Sanders.", 1941);

  public static Movies For1942 = new Movies("How Green Was My Valley",
      "At the turn of the century in a Welsh mining village, the Morgans, he stern, she gentle, raise coal-mining sons and hope their youngest will find a better life.",
      "Walter Pidgeon, Maureen O'Hara, and Anna Lee.", 1942);

  public static Movies For1943 = new Movies("Mrs. Miniver",
      "A British family struggles to survive the first months of World War II.",
      "Greer Garson, Walter Pidgeon, and Teresa Wright.", 1943);

  public static Movies For1944 = new Movies("Casablanca",
      "In Casablanca, Morocco in December 1941, a cynical American expatriate meets a former lover, with unforeseen complications.",
      "Humphrey Bogart, Ingrid Bergman, and Paul Henreid.", 1944);

  public static Movies For1945 = new Movies("Going My Way",
      "Youthful Father Chuck O'Malley led a colorful life of sports, song, and romance before joining the Roman Catholic clergy. After joining a parish, O'Malley's worldly knowledge helps him connect with a gang of kids looking for direction.",
      "Bing Crosby, Barry Fitzgerald, and Frank McHugh.", 1945);

  public static Movies For1946 = new Movies("The Lost Weekend",
      "The desperate life of a chronic alcoholic is followed through a four-day drinking bout.",
      "Ray Milland, Jane Wyman, and Phillip Terry.", 1946);

  public static Movies For1947 = new Movies("The Best Years of Our Lives",
      "Three World War II veterans return home to small-town America to discover that they and their families have been irreparably changed.",
      "Fredric March, Dana Andrews, and Myrna Loy.", 1947);

  public static Movies For1948 = new Movies("Gentleman's Agreement",
      "A reporter pretends to be Jewish in order to cover a story on anti-Semitism, and personally discovers the true depths of bigotry and hatred.",
      "Gregory Peck, Dorothy McGuire, and John Garfield.", 1948);

  public static Movies For1949 = new Movies("Hamlet",
      "Prince Hamlet struggles over whether or not he should kill his uncle, whom he suspects has murdered his father, the former king.",
      "Laurence Olivier, Jean Simmons, and John Laurie.", 1949);

  public static Movies For1950 = new Movies("All the King's Men",
      "The rise and fall of a corrupt politician, who makes his friends richer and retains power by dint of a populist appeal.",
      "Broderick Crawford, John Ireland, and Joanne Dru.", 1950);

  public static Movies For1951 = new Movies("All About Eve",
      "An ingenue insinuates herself into the company of an established but aging stage actress and her circle of theater friends.",
      "Bette Davis, Anne Baxter, and George Sanders.", 1951);

  public static Movies For1952 = new Movies("An American in Paris",
      "Three friends struggle to find work in Paris. Things become more complicated when two of them fall in love with the same woman.",
      "Gene Kelly, Leslie Caron, and Oscar Levant.", 1952);

  public static Movies For1953 = new Movies("The Greatest Show on Earth",
      "The dramatic lives of trapeze artists, a clown, and an elephant trainer are told against a background of circus spectacle.",
      "James Stewart, Charlton Heston, and Betty Hutton.", 1953);

  public static Movies For1954 = new Movies("From Here to Eternity",
      "In Hawaii in 1941, a private is cruelly punished for not boxing on his unit's team, while his captain's wife and second-in-command are falling in love.",
      "Burt Lancaster, Montgomery Clift, and Deborah Kerr.", 1954);

  public static Movies For1955 = new Movies("On the Waterfront",
      "An ex-prize fighter turned longshoreman struggles to stand up to his corrupt union bosses.",
      "Marlon Brando, Karl Malden, and Lee J. Cobb.", 1955);

  public static Movies For1956 = new Movies("Marty",
      "A middle-aged butcher and a school teacher who have given up on the idea of love meet at a dance and fall for each other.",
      "Ernest Borgnine, Betsy Blair, and Esther Minciotti. ", 1956);

  public static Movies For1957 = new Movies("Around the World in 80 Days",
      "A Victorian Englishman bets that with the new steamships and railways he can circumnavigate the globe in eighty days.",
      "David Niven, Cantinflas, and Shirley MacLaine.", 1957);

  public static Movies For1958 = new Movies("The Bridge on the River Kwai",
      "After settling his differences with a Japanese PoW camp commander, a British colonel co-operates to oversee his men's construction of a railway bridge for their captors - while oblivious to a plan by the Allies to destroy it.",
      "William Holden, Alec Guinness, and Jack Hawkins.", 1958);

  public static Movies For1959 = new Movies("Gigi",
      "Weary of the conventions of Parisian society, a rich playboy and a youthful courtesan-in-training enjoy a platonic friendship, but it may not stay platonic for long.",
      "Leslie Caron, Maurice Chevalier, and Louis Jourdan.", 1959);

  public static Movies For1960 = new Movies("Ben-Hur",
      "When a Jewish prince is betrayed and sent into slavery by a Roman friend, he regains his freedom and comes back for revenge.",
      "Charlton Heston, Jack Hawkins, and Stephen Boyd", 1960);

  public static Movies For1961 = new Movies("The Apartment",
      "A man tries to rise in his company by letting its executives use his apartment for trysts, but complications and a romance of his own ensue.",
      "Jack Lemmon, Shirley MacLaine, and Fred MacMurray.", 1961);

  public static Movies For1962 = new Movies("West Side Story",
      "Two youngsters from rival New York City gangs fall in love, but tensions between their respective friends build toward tragedy.",
      "Natalie Wood, George Chakiris, and Richard Beymer", 1962);

  public static Movies For1963 = new Movies("Lawrence of Arabia",
      "The story of T.E. Lawrence, the English officer who successfully united and led the diverse, often warring, Arab tribes during World War I in order to fight the Turks.",
      "Peter O'Toole, Alec Guinness, and Anthony Quinn", 1963);

  public static Movies For1964 = new Movies("Tom Jones",
      "The romantic and chivalrous adventures of adopted bastard Tom Jones in 18th century England.",
      "Albert Finney, Susannah York, and George Devine.", 1964);

  public static Movies For1965 = new Movies("My Fair Lady",
      "A misogynistic and snobbish phonetics professor agrees to a wager that he can take a flower girl and make her presentable in high society.",
      "Audrey Hepburn, Rex Harrison, and Stanley Holloway.", 1965);

  public static Movies For1966 = new Movies("he Sound of Music",
      "A woman leaves an Austrian convent to become a governess to the children of a Naval officer widower.",
      "Julie Andrews, Christopher Plummer, and Eleanor Parker.", 1966);

  public static Movies For1967 = new Movies("A Man for All Seasons",
      "The story of Thomas More, who stood up to King Henry VIII when the King rejected the Roman Catholic Church to obtain a divorce and remarriage.",
      "Paul Scofield, Wendy Hiller, and Robert Shaw.", 1967);

  public static Movies For1968 = new Movies("In the Heat of the Night",
      "An African-American police detective is asked to investigate a murder in a racially hostile southern town.",
      "Sidney Poitier, Rod Steiger, and Warren Oates.", 1968);

  public static Movies For1969 = new Movies("Oliver!",
      "Young Oliver Twist runs away from an orphanage and meets a group of boys trained to be pickpockets by an elderly mentor.",
      "Mark Lester, Ron Moody, and Shani Wallis.", 1969);

  public static Movies For1970 = new Movies("Midnight Cowboy",
      "A naive hustler travels from Texas to New York to seek personal fortune but, in the process, finds himself a new friend.",
      "Dustin Hoffman, Jon Voight, and Sylvia Miles.", 1970);

  public static Movies For1971 = new Movies("Patton",
      "The World War II phase of the career of the controversial American general, George S. Patton.",
      "George C. Scott, Karl Malden, and Stephen Young.", 1971);

  public static Movies For1972 = new Movies("The French Connection",
      "A pair of NYC cops in the Narcotics Bureau stumble onto a drug smuggling job with a French connection.",
      "Gene Hackman, Roy Scheider, and Fernando Rey.", 1972);

  public static Movies For1973 = new Movies("The Godfather",
      "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
      "Marlon Brando, Al Pacino, and James Caan.", 1973);

  public static Movies For1974 = new Movies("The Sting",
      "In Chicago in September 1936, a young con man seeking revenge for his murdered partner teams up with a master of the big con to win a fortune from a criminal banker.",
      "Paul Newman, Robert Redford, and Robert Shaw.", 1974);

  public static Movies For1975 = new Movies("The Godfather: Part II",
      "The early life and career of Vito Corleone in 1920s New York is portrayed while his son, Michael, expands and tightens his grip on the family crime syndicate.",
      "Al Pacino, Robert De Niro, and Robert Duvall.", 1975);

  public static Movies For1976 = new Movies("One Flew Over the Cuckoo's Nest",
      "A criminal pleads insanity after getting into trouble again and once in the mental institution rebels against the oppressive nurse and rallies up the scared patients.",
      "Jack Nicholson, Louise Fletcher, and Michael Berryman.", 1976);

  public static Movies For1977 = new Movies("Rocky",
      "Rocky Balboa, a small-time boxer, gets a supremely rare chance to fight heavy-weight champion Apollo Creed in a bout in which he strives to go the distance for his self-respect.",
      "Sylvester Stallone, Talia Shire, and Burt Young.", 1977);

  public static Movies For1978 = new Movies("Annie Hall",
      "Neurotic New York comedian Alvy Singer falls in love with the ditzy Annie Hall.",
      "Woody Allen, Diane Keaton, and Tony Roberts.", 1978);

  public static Movies For1979 = new Movies("The Deer Hunter",
      "An in-depth examination of the ways in which the U.S. Vietnam War impacts and disrupts the lives of people in a small industrial town in Pennsylvania.",
      "Robert De Niro, Christopher Walken, and John Cazale.", 1979);

  public static Movies For1980 = new Movies("Kramer vs. Kramer",
      "Ted Kramer's wife leaves her husband, allowing for a lost bond to be rediscovered between Ted and his son, Billy. But a heated custody battle ensues over the divorced couple's son, deepening the wounds left by the separation.",
      "Dustin Hoffman, Meryl Streep, and Jane Alexander.", 1980);

  public static Movies For1981 = new Movies("Ordinary People",
      "The accidental death of the older son of an affluent family deeply strains the relationships among the bitter mother, the good-natured father, and the guilt-ridden younger son.",
      "Donald Sutherland, Mary Tyler Moore, and Judd Hirsch.", 1981);

  public static Movies For1982 = new Movies("Chariots of Fire",
      "Two British track athletes, one a determined Jew and the other a devout Christian, compete in the 1924 Olympics.",
      "Ben Cross, Ian Charleson, and Nicholas Farrell.", 1982);

  public static Movies For1983 = new Movies("Gandhi",
      "Gandhi's character is fully explained as a man of nonviolence. Through his patience, he is able to drive the British out of the subcontinent. And the stubborn nature of Jinnah and his commitment towards Pakistan is portrayed.",
      "Ben Kingsley, John Gielgud, and Candice Bergen.", 1983);

  public static Movies For1984 = new Movies("Terms of Endearment",
      "Follows hard-to-please Aurora looking for love and her daughter's family problems.",
      "Shirley MacLaine, Debra Winger, and Jack Nicholson.", 1984);

  public static Movies For1985 = new Movies("Amadeus",
      "The incredible story of Wolfgang Amadeus Mozart, told by his peer and secret rival Antonio Salieri — now confined to an insane asylum.",
      "F. Murray Abraham, Tom Hulce, and Elizabeth Berridge.", 1985);

  public static Movies For1986 = new Movies("Out of Africa",
      "In 20th century colonial Kenya, a Danish baroness/plantation owner has a passionate love affair with a free-spirited big-game hunter.",
      "Meryl Streep, Robert Redford, and Klaus Maria Brandauer.", 1986);

  public static Movies For1987 = new Movies("Platoon",
      "A young recruit in Vietnam faces a moral crisis when confronted with the horrors of war and the duality of man.",
      "Charlie Sheen, Tom Berenger, and Willem Dafoe.", 1987);

  public static Movies For1988 = new Movies("The Last Emperor",
      "The story of the final Emperor of China.", "John Lone, Joan Chen, and Peter O'Toole.", 1988);

  public static Movies For1989 = new Movies("Rain Man",
      "Selfish yuppie Charlie Babbitt's father left a fortune to his savant brother Raymond and a pittance to Charlie; they travel cross-country.",
      "Dustin Hoffman, Tom Cruise, and Valeria Golino.", 1989);

  public static Movies For1990 = new Movies("Driving Miss Daisy",
      "An old Jewish woman and her African-American chauffeur in the American South have a relationship that grows and improves over the years.",
      "Morgan Freeman, Jessica Tandy, and Dan Aykroyd.", 1990);

  public static Movies For1991 = new Movies("Dances with Wolves",
      "Lt. John Dunbar, exiled to a remote western Civil War outpost, befriends wolves and Native Americans, making him an intolerable aberration in the military.",
      "Kevin Costner, Mary McDonnell, and Graham Greene.", 1991);

  public static Movies For1992 = new Movies("The Silence of the Lambs",
      "A young F.B.I. cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer who skins his victims.",
      "Jodie Foster, Anthony Hopkins, and Lawrence A. Bonney.", 1992);

  public static Movies For1993 = new Movies("Unforgiven",
      "Retired Old West gunslinger William Munny reluctantly takes on one last job, with the help of his old partner and a young man.",
      "Clint Eastwood, Gene Hackman, and Morgan Freeman.", 1993);

  public static Movies For1994 = new Movies("Schindler's List",
      "In German-occupied Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazi Germans",
      "Liam Neeson, Ralph Fiennes, and Ben Kingsley.", 1994);

  public static Movies For1995 = new Movies("Forrest Gump",
      "Forrest Gump, while not intelligent, has accidentally been present at many historic moments, but his true love, Jenny Curran, eludes him.",
      "Tom Hanks, Robin Wright, and Gary Sinise.", 1995);

  public static Movies For1996 = new Movies("Braveheart",
      "Sir William Wallace begins a revolt against King Edward I of England after an English soldier assaults the woman he loves.",
      "Mel Gibson, Sophie Marceau, and Patrick McGoohan.", 1996);

  public static Movies For1997 = new Movies("The English Patient",
      "At the close of WWII, a young nurse tends to a badly-burned plane crash victim. His past is shown in flashbacks, revealing an involvement in a fateful love affair.",
      "Ralph Fiennes, Juliette Binoche, and Willem Dafoe.", 1997);

  public static Movies For1998 = new Movies("Titanic",
      "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
      "Leonardo DiCaprio, Kate Winslet, and Billy Zane.", 1998);

  public static Movies For1999 = new Movies("Shakespeare in Love",
      "A young Shakespeare, out of ideas and short of cash, meets his ideal woman and is inspired to write one of his most famous plays.",
      "Gwyneth Paltrow, Joseph Fiennes, and Geoffrey Rush. ", 1999);

  public static Movies For2000 = new Movies("American Beauty",
      "A sexually frustrated suburban father has a mid-life crisis after becoming infatuated with his daughter's best friend.",
      "Kevin Spacey, Annette Bening, and Thora Birch.", 2000);

  public static Movies For2001 = new Movies("Gladiator",
      "When a Roman general is betrayed and his family murdered by an emperor's corrupt son, he comes to Rome as a gladiator to seek revenge.",
      "Russell Crowe, Joaquin Phoenix, and Connie Nielsen.", 2001);

  public static Movies For2002 = new Movies("A Beautiful Mind",
      "After John Nash, a brilliant but asocial mathematician, accepts secret work in cryptography, his life takes a turn for the nightmarish.",
      "Russell Crowe, Ed Harris, and Jennifer Connelly.", 2002);

  public static Movies For2003 = new Movies("Chicago",
      "Murderesses Velma Kelly and Roxie Hart find themselves on death row together and fight for the fame that will keep them from the gallows in 1920s Chicago.",
      "Renée Zellweger, Catherine Zeta-Jones, and Richard Gere.", 2003);

  public static Movies For2004 = new Movies("The Lord of the Rings: Return of the King",
      "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
      "Elijah Wood, Viggo Mortensen, and Ian McKellen.", 2004);

  public static Movies For2005 = new Movies("Million Dollar Baby",
      "A determined woman works with a hardened boxing trainer to become a professional.",
      "Hilary Swank, Clint Eastwood, and Morgan Freeman.", 2005);

  public static Movies For2006 = new Movies("Crash",
      "Los Angeles citizens with vastly separate lives collide in interweaving stories of race, loss and redemption.",
      "Don Cheadle, Sandra Bullock, and Thandie Newton.", 2006);

  public static Movies For2007 = new Movies("The Departed",
      "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.",
      "Leonardo DiCaprio, Matt Damon, and Jack Nicholson.", 2007);

  public static Movies For2008 = new Movies("No Country for Old Men",
      "Violence and mayhem ensue after a hunter stumbles upon a drug deal gone wrong and more than two million dollars in cash near the Rio Grande.",
      "Tommy Lee Jones, Javier Bardem, and Josh Brolin.", 2008);

  public static Movies For2009 = new Movies("Slumdog Millionaire",
      "A Mumbai teen reflects on his upbringing in the slums when he is accused of cheating on the Indian version of 'Who Wants to be a Millionaire?",
      "Dev Patel, Freida Pinto, and Saurabh Shukla.", 2009);

  public static Movies For2010 = new Movies("The Hurt Locker",
      "During the Iraq War, a Sergeant recently assigned to an army bomb squad is put at odds with his squad mates due to his maverick way of handling his work.",
      "Jeremy Renner, Anthony Mackie, and Brian Geraghty. ", 2010);

  public static Movies For2011 = new Movies("The King's Speech",
      "The story of King George VI, his impromptu ascension to the throne and the speech therapist who helped the unsure monarch become worthy of it.",
      "Colin Firth, Geoffrey Rush, and Helena Bonham Carter.", 2011);

  public static Movies For2012 = new Movies("The Artist",
      "A silent movie star meets a young dancer, but the arrival of talking pictures sends their careers in opposite directions.",
      "Jean Dujardin, Bérénice Bejo, and John Goodman.", 2012);

  public static Movies For2013 = new Movies("Argo",
      "Acting under the cover of a Hollywood producer scouting a location for a science fiction film, a CIA agent launches a dangerous operation to rescue six Americans in Tehran during the U.S. hostage crisis in Iran in 1980.",
      "Ben Affleck, Bryan Cranston, and John Goodman.", 2013);

  public static Movies For2014 = new Movies("12 Years a Slave",
      "In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.",
      " Chiwetel Ejiofor, Michael Kenneth Williams, and Michael Fassbender.", 2014);

  public static Movies For2015 = new Movies("Birdman or (The Unexpected Virtue of Ignorance)",
      "Illustrated upon the progress of his latest Broadway play, a former popular actor's struggle to cope with his current life as a wasted actor is shown.",
      "", 2015);

  public static Movies For2016 = new Movies("Spotlight",
      "The true story of how the Boston Globe uncovered the massive scandal of child molestation and cover-up within the local Catholic Archdiocese, shaking the entire Catholic Church to its core.",
      "Mark Ruffalo, Michael Keaton, and Rachel McAdams.", 2016);

  public static Movies For2017 = new Movies("Moonlight",
      "A timeless story of human self-discovery and connection, 'Moonlight' chronicles the life of a young black man from childhood to adulthood as he struggles to find his place in the world while growing up in a rough neighborhood of Miami.",
      "Mahershala Ali, Shariff Earp, and Duan Sanderson.", 2017);

  public static Movies For2018 = new Movies("The Shape of Water",
      "At a top secret research facility in the 1960s, a lonely janitor forms a unique relationship with an amphibious creature that is being held in captivity.",
      "Sally Hawkins, Octavia Spencer, Michael Shannon, Doug Jones.", 2018);

  public static Movies For2019 = new Movies("Green Book",
      "A working-class Italian-American bouncer becomes the driver of an African-American classical pianist on a tour of venues through the 1960s American South.",
      "Mahershala Ali, Viggo Mortenson", 2019);

  public static Movies For2020 = new Movies("Parasite",
      "All unemployed, Ki-taek and his family take peculiar interest in the wealthy and glamorous Parks, as they ingratiate themselves into their lives and get entangled in an unexpected incident.",
      "Kang-ho Song, Sun-kyun Lee, Yeo-jeong Jo", 2020);
}


