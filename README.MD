# Gaia Procedural Gen: Stellar System Generator

## Description

The Gaia Procedural Gen is a tool that generates fictitious stellar systems based on real data from the Gaia Sky catalogue DSR3. It is designed to serve as a generator for a future mobile simulator project.

Please note that the generated systems are not real astronomical systems. While they are derived from actual Gaia data, they have been created specifically for simulation purposes.

This tool is currently a work in progress and will form the foundation for a future mobile development project.

## Requirements

The Gaia Procedural Gen requires the following dependencies to be installed:

- Java 8 or higher
- Maven 3.6.3 or higher
- Gaia Sky data release 3
- Jackson library (com.fasterxml.jackson.core:jackson-databind:2.13.0)

## Usage

To use the Gaia Procedural Gen, follow these steps:

1. Clone the repository or download the source code.
2. Install the required dependencies (listed in the requirements.txt file) if necessary.
3. Run the ProceduralSystemGenerator class, either from an IDE or through the command line.
4. Adjust the parameters in the code to customize the generated stellar systems. You can specify the number of star systems to generate and the maximum number of planets per system.
5. Execute the program and wait for the generation process to complete.
6. Once the generation is finished, the program will display the generated stellar systems with their respective stars and planets.
7. Optionally, you can modify the code to save the generated systems in a desired format or perform additional operations on the data.

Please note that this program requires the Gaia Sky data release 3 to be available in order to generate the stellar systems accurately.

## Example Output

Here is an example of the program's output:
    
```
StarSystem{
    name='Gaia EDR3 4295806720', 
    star=Star [
        name=Gaia EDR3 4295806720, 
        ra=44.99615537864534, 
        dec=0.005615226341865997, 
        parsecs=2.8222234098459342, 
        y/l=9.200448316097745, 
        parallax=0.3543305595550248, 
        l=176.94278852482034, 
        b=-48.88493355232444, 
        photGMeanMag=17.641426, 
        dr2RadialVelocity=0.0, 
        bpRp=2.4582462
    ], 
    planets=[
        Planet{
            name='Gaia_EDR3_4295806720_P1', 
            mass=43.789968203788455, 
            radius=0.5531894288443084, 
            distanceFromStar=942.4260209055288, 
            orbitalPeriod=139.35807606897365
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P2', 
            mass=44.00430664051548, 
            radius=1.2126172505262423, 
            distanceFromStar=750.563551937235, 
            orbitalPeriod=148.77054739766848
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P3', 
            mass=5.32178537491077, 
            radius=0.2763491633488757, 
            distanceFromStar=603.9132737513733, 
            orbitalPeriod=332.8736757452051
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P4', 
            mass=83.95210219828637, 
            radius=2.924333671909778, 
            distanceFromStar=22.963417939551476, 
            orbitalPeriod=747.2069251243662
        }
    ]
}
```

Star and planet objects are displayed in JSON format, with the following properties:

1. Star:
   - designation: The name or identifier of the star.
   - ra: Right ascension, which represents the star's position on the celestial sphere.
   - dec: Declination, which represents the star's position on the celestial sphere.
   - parallax: The parallax measurement of the star, providing information about its distance.
   - l: Galactic longitude, indicating the star's position in the galaxy.
   - b: Galactic latitude, indicating the star's position in the galaxy.
   - photGMeanMag: The mean magnitude of the star in the G-band, providing information about its brightness.
   - dr2RadialVelocity: Radial velocity, indicating the star's motion towards or away from us.
   - bpRp: Color index representing the difference in magnitude between the Bp and Rp bands, which can provide information about the star's temperature and color.

2. Planet:
   - Name: The name of the planet.
   - mass: The mass of the planet, in earth masses.
   - radius: The radius of the planet, in earth radii.
   - distanceFromStar: The distance between the planet and its host star, in AU.
   - orbitalPeriod: The orbital period of the planet, in days.
            

## Roadmap:

1. Import catalog from CSV file:
   - Develop functionality to import data from a CSV file containing information about stars and planets.
   - Implement a parser to read and process the CSV file and convert it into usable objects in the program.
   - Validate the imported data and handle possible errors or inconsistencies in the file format.

2. Improve designation of names for planets:
   - Implement logic to generate more descriptive and meaningful names for the generated planets.
   - Use algorithms or patterns to assign names based on features such as the host star, the order of the planets, or specific characteristics of each planet.

3. Incorporate different stellar objects into the systems:
   - Discriminate between different types of objects in the catalog, such as stars, planets, and other objects, using the following fields:
      - designation: The object's designation can provide information about its type, such as "Star," "Galaxy," "Quasar," and so on.
      - phot_g_mean_mag, phot_bp_mean_mag, phot_rp_mean_mag: These fields represent magnitudes in different light bands (G, BP, RP). The combination of these magnitudes can help identify if the object is a star, a galaxy, or a more exotic object.
      - bp_rp: The BP-RP color index can be useful in distinguishing different types of objects, as it can provide information about the object's temperature or spectral features.
      - dr2_radial_velocity: Radial velocity can indicate whether the object is a star with peculiar motion or if it is associated with a more massive object such as a star cluster or a galaxy.
   - Expand the generation of stellar systems to include different types of objects, such as binary stars, neutron stars, black holes, among others.
   - Develop the rules and algorithms necessary to generate systems that contain these objects, considering their properties and gravitational relationships.

4. Create MySQL database and use it as a data source:
   - Configure a MySQL database to store and manage the data of the generated stellar systems.
   - Implement integration with the database in the program, allowing reading and writing of data from and to the database.
   - Use SQL queries to perform operations such as searching, filtering, and updating data in the database.

5. Generate a menu for interacting with the database and selecting generation options:
   - All these features should be implemented through another framework, such as JavaFX or Swing, or maybe porting all the project to Unity/C#.
   - Develop a user-friendly menu system that allows users to interact with the Gaia Procedural Gen and select various options for generating stellar systems.
   - Implement menu functionality to display available actions, such as importing catalog data, generating systems, querying existing systems, and managing database settings.
   - Incorporate user input validation to ensure that valid options are selected and handle errors or invalid inputs gracefully.
   - Enable the ability to customize generation parameters through the menu, such as specifying the number of star systems, maximum number of planets, or other relevant parameters.
   - Provide feedback and status updates during the generation process, allowing users to monitor progress and receive notifications upon completion.

6. Create a visual representation of the generated systems:
   - Develop a graphical user interface (GUI) to display the generated systems in a visual format.
   - Implement a 3D rendering engine to display the systems in a 3D environment.
   - Use the Gaia Sky data release 3 to generate a 3D model of the Milky Way galaxy.
      - The position data (l, b, ecl_lon, ecl_lat) represents the position of an object in space in terms of astronomical coordinates. These coordinates describe the object's location relative to a specific reference system.
      - "l" (galactic longitude) and "b" (galactic latitude) define the object's position within the Galaxy. These coordinates are based on a galactic coordinate system and are used to locate the object within the Milky Way.
      - "ecl_lon" (ecliptic longitude) and "ecl_lat" (ecliptic latitude) represent the object's position relative to the plane of the ecliptic, which is the plane defined by the Earth's orbit around the Sun. These coordinates are used to locate objects within the solar system.
   - Integrate the 3D model of the Milky Way with the rendering engine to display the generated systems in the galaxy.
   - Implement functionality to display the systems in the GUI, allowing users to navigate the galaxy and explore the systems.
   - Provide options to customize the display of the systems, such as filtering by properties or highlighting specific objects.

By adding this interactive menu system, users will have a more intuitive and flexible way to control the Gaia Procedural Gen, allowing them to choose specific options and generate stellar systems according to their preferences. This will also allow users to manage the database and perform operations such as searching and filtering systems, as well as updating or deleting existing systems.


## Contributing
Contributions to the Gaia Procedural Gen project are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request on the GitHub repository.

## License
The Gaia Procedural Gen is open-source software licensed under the MIT license. Feel free to use, modify, and distribute this code for personal or commercial purposes.

## Acknowledgements
The Gaia Procedural Gen relies on the Gaia Sky data release 3, made available by the European Space Agency (ESA). We would like to express our gratitude to the Gaia mission and the ESA for providing the data that makes this project possible.

https://www.cosmos.esa.int/web/gaia/data-release-3
http://cdn.gea.esac.esa.int/Gaia/gedr3/gaia_source/

This work has made use of data from the European Space Agency (ESA) mission Gaia (https://www.cosmos.esa.int/gaia), processed by the Gaia Data Processing and Analysis Consortium (DPAC, https://www.cosmos.esa.int/web/gaia/dpac/consortium). Funding for the DPAC has been provided by national institutions, in particular the institutions participating in the Gaia Multilateral Agreement.

http://esdcdoi.esac.esa.int/doi/html/data/astronomy/gaia/DR3.html

## Authors

* **Alberto Pérez** - k3ssdev@proton.me