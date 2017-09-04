# lite-dbpedia

This project is a simple tool that aims to create a simple and focused view of Dbpedia.

Thanks to [Dbpedia](http://wiki.dbpedia.org/), it's a great knowledge graph that can be used in linked data and semantic web projects. Although Dbpedia is published as seperate datasets such as instance types, labels and properties, each of this files is still huge and contains so many triples. This sometimes makes hard working on local environment using Dbpedia.

This tool is very small and simple utility. It just takes the filtered types from settings file and create a subset that only contains instances of these filtered types, their labels and properties. It only uses intance types, labels and properties file of Dbpedia. You can find the sample settings file under **\_files** directory. First line contains locations of Dbpedia ontology, instance types, labels and properties files. Other lines contain the types that will be used during creating filtered subset of Dbpedia. Subtypes of given filtered types are also considered during filtering process.

You can check the code for further details.
