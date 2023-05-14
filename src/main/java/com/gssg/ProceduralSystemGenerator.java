package com.gssg;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ProceduralSystemGenerator {
    public static void main(String[] args) {
        List<StarData> starDataList = new ArrayList<>();

        // Agrega los datos de las estrellas del catálogo Gaia
        /*solution_id,designation,source_id,random_index,ref_epoch,ra,ra_error,dec,dec_error,parallax,parallax_error,parallax_over_error,pm,pmra,pmra_error,pmdec,pmdec_error,ra_dec_corr,ra_parallax_corr,ra_pmra_corr,ra_pmdec_corr,dec_parallax_corr,dec_pmra_corr,dec_pmdec_corr,parallax_pmra_corr,parallax_pmdec_corr,pmra_pmdec_corr,astrometric_n_obs_al,astrometric_n_obs_ac,astrometric_n_good_obs_al,astrometric_n_bad_obs_al,astrometric_gof_al,astrometric_chi2_al,astrometric_excess_noise,astrometric_excess_noise_sig,astrometric_params_solved,astrometric_primary_flag,nu_eff_used_in_astrometry,pseudocolour,pseudocolour_error,ra_pseudocolour_corr,dec_pseudocolour_corr,parallax_pseudocolour_corr,pmra_pseudocolour_corr,pmdec_pseudocolour_corr,astrometric_matched_transits,visibility_periods_used,astrometric_sigma5d_max,matched_transits,new_matched_transits,matched_transits_removed,ipd_gof_harmonic_amplitude,ipd_gof_harmonic_phase,ipd_frac_multi_peak,ipd_frac_odd_win,ruwe,scan_direction_strength_k1,scan_direction_strength_k2,scan_direction_strength_k3,scan_direction_strength_k4,scan_direction_mean_k1,scan_direction_mean_k2,scan_direction_mean_k3,scan_direction_mean_k4,duplicated_source,phot_g_n_obs,phot_g_mean_flux,phot_g_mean_flux_error,phot_g_mean_flux_over_error,phot_g_mean_mag,phot_bp_n_obs,phot_bp_mean_flux,phot_bp_mean_flux_error,phot_bp_mean_flux_over_error,phot_bp_mean_mag,phot_rp_n_obs,phot_rp_mean_flux,phot_rp_mean_flux_error,phot_rp_mean_flux_over_error,phot_rp_mean_mag,phot_bp_n_contaminated_transits,phot_bp_n_blended_transits,phot_rp_n_contaminated_transits,phot_rp_n_blended_transits,phot_proc_mode,phot_bp_rp_excess_factor,bp_rp,bp_g,g_rp,dr2_radial_velocity,dr2_radial_velocity_error,dr2_rv_nb_transits,dr2_rv_template_teff,dr2_rv_template_logg,dr2_rv_template_fe_h,l,b,ecl_lon,ecl_lat
1636042515805110273,"Gaia EDR3 4295806720",4295806720,1067963836,2016.0,44.99615537864534,0.10161827,0.005615226341865997,0.10133387,0.3543305595550248,0.12266381,2.8886316,12.616485,11.93835156938502,0.13794228,-4.0806193394130865,0.13316983,0.12293493,0.13202813,-0.08891027,0.022551458,-0.3653421,-0.03690377,-0.24483804,0.06301233,0.13570854,0.3343367,184,0,183,1,2.6720488,242.20697,0.3806193,2.0765078,31,False,1.5089388,,,,,,,,22,16,0.21780181,22,9,0,0.01759732,90.23934,0,0,1.1429516,0.30795118,0.19765861,0.43010107,0.8420776,-87.75478,-30.69455,-46.20191,30.174356,False,182,1653.39471645947,2.0757642,796.5234,17.641426,18,800.4295459066461,12.601409,63.51905,18.080235,20,1187.588003883822,15.823832,75.0506,17.061232,0,0,0,2,0,1.2023853,1.0190029,0.43880844,0.5801945,,,0,,,,176.95107618038946,-48.901520870941965,42.53372584780011,-16.32957416215404
1636042515805110273,"Gaia EDR3 34361129088",34361129088,1721389493,2016.0,45.00432028915398,0.09731972,0.021047763781174733,0.101752974,3.235017271512856,0.12045025,26.857704,35.230515,29.518344127131527,0.13369285,19.231654938806578,0.13392176,0.16325329,6.428645E-4,-0.073663116,-0.012016551,-0.40389284,-0.10152152,-0.31593448,0.14065048,0.23142646,0.38175407,172,0,171,1,1.081467,194.59933,0.26741344,1.0328022,31,False,1.285487,,,,,,,,20,15,0.22053866,20,9,0,0.05737302,84.542816,0,0,1.0578898,0.28431648,0.18242157,0.4234895,0.8483561,-101.856606,-31.586445,-44.381237,29.909302,False,170,1763.191386728999,2.1212356,831.2096,17.571619,18,389.99713585371074,9.491409,41.089485,18.86089,19,2178.214858374066,15.074686,144.49487,16.402643,0,2,0,1,0,1.4565701,2.4582462,1.2892704,1.1689758,,,0,,,,176.94278852482034,-48.88493355232444,42.54657309907107,-16.317212317623884
 */
        starDataList.add(new StarData("1636042515805110273"
        ,"Gaia EDR3 4295806720"
        ,"4295806720"
        ,"1067963836"
        ,2016.0
        ,44.99615537864534
        ,0.10161827
        ,0.005615226341865997
        ,0.10133387
        ,0.3543305595550248
        ,0.12266381
        ,2.8886316
        ,12.616485
        ,11.93835156938502
        ,0.13794228
        ,-4.0806193394130865
        ,0.13316983
        ,0.12293493
        ,0.13202813
        ,-0.08891027
        ,0.022551458
        ,-0.3653421
        ,-0.03690377
        ,-0.24483804
        ,0.06301233
        ,0.13570854
        ,0.3343367
        ,184
        ,0
        ,183
        ,1
        ,2.6720488
        ,242.20697
        ,0.3806193
        ,2.0765078
        ,31
        ,false
        ,1.5089388
        ,0
        ,0
        ,0
        ,22
        ,16
        ,0.21780181
        ,22
        ,9
        ,0
        ,0.01759732
        ,0, 0, 0, 90.23934
        ,0
        ,0
        ,1.1429516
        ,0.30795118
        ,0.19765861
        ,0.43010107
        ,0.8420776
        ,-87.75478
        ,-30.69455
        ,-46.20191
        ,30.174356
        ,0, false
        ,182
        ,1653.39471645947
        ,2.0757642
        ,796.5234
        ,17.641426
        ,18
        ,800.4295459066461
        ,12.601409
        ,63.51905
        ,18.080235
        ,20
        ,1187.588003883822
        ,15.823832
        ,75.0506
        ,17.061232
        ,0
        ,0
        ,0
        ,2
        ,0
        ,1.4565701
        ,2.4582462
        ,1.2892704
        ,1.1689758
        ,0
        ,0
        ,0
        ,0
        ,0
        ,0
        ,176.94278852482034
        ,-48.88493355232444
        ,42.54657309907107
        ,-16.317212317623884
        ));
            
        // Genera los sistemas estelares utilizando los datos del catálogo Gaia
        List<StarSystem> systems = generateSystems(starDataList);

        // Imprime los sistemas estelares generados
        for (StarSystem system : systems) {
            System.out.println(system);
        }
    }

    // Genera los sistemas estelares utilizando los datos del catálogo Gaia
    private static List<StarSystem> generateSystems(List<StarData> starDataList) {
        List<StarSystem> systems = new ArrayList<>();
        // Genera un sistema estelar por cada estrella del catálogo Gaia
        for (StarData starData : starDataList) {
            Star star = new Star(starData.getDesignation(), starData.getRa(), starData.getDec(), starData.getParallax());
            StarSystem system = new StarSystem(starData.getDesignation(), star);
            
            // Genera un número aleatorio de planetas (hasta 20)
            int numPlanets = (int) (Math.random() * 20); // Genera un número aleatorio de planetas (hasta 20)
            for (int i = 0; i < numPlanets; i++) {
                Planet planet = generatePlanet(system, i + 1);
                system.addPlanet(planet);
            }
            // Añade el sistema estelar a la lista de sistemas
            systems.add(system);
        }
    
        return systems;
    }
    

    // Genera un planeta con atributos aleatorios
    private static Planet generatePlanet(StarSystem starSystem, int planetIndex) {
        // Genera atributos aleatorios para el planeta
        String name = generatePlanetName(starSystem, planetIndex);
        double mass = Math.random() * 100;
        double radius = Math.random() * 10;
        double distance = Math.random() * 1000;
        double orbitalPeriod = Math.random() * 1000;

        return new Planet(name, mass, radius, distance, orbitalPeriod);
    }

    // Genera el nombre de un planeta a partir del nombre del sistema estelar y el índice del planeta
    private static String generatePlanetName(StarSystem starSystem, int planetIndex) {
        String systemIdentifier = starSystem.getName().replaceAll(" ", "_");
        String planetIdentifier = "P" + planetIndex;
        return systemIdentifier + "_" + planetIdentifier;
    }

}