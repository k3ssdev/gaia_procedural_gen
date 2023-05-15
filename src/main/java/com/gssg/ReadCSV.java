package com.gssg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public static List<StarData> readCSV(String filename) {
        List<StarData> starDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Avoid first line with column names
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Check empty values
                for (int i = 0; i < values.length; i++) {
                    if (values[i].isEmpty()) {
                        values[i] = "0";
                    }
                }

                // Remove quotes
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].replace("\"", "");
                }

                // Print array
                //System.out.println(Arrays.toString(values));

                // New StarData object from CSV line
                StarData starData = new StarData(
                        values[0], // solutionId
                        values[1], // designation
                        values[2], // sourceId
                        values[3], // randomIndex
                        Double.parseDouble(values[4]), // refEpoch
                        Double.parseDouble(values[5]), // ra
                        Double.parseDouble(values[6]), // raError
                        Double.parseDouble(values[7]), // dec
                        Double.parseDouble(values[8]), // decError
                        Double.parseDouble(values[9]), // parallax
                        Double.parseDouble(values[10]), // parallaxError
                        Double.parseDouble(values[11]), // parallaxOverError
                        Double.parseDouble(values[12]), // pm
                        Double.parseDouble(values[13]), // pmra
                        Double.parseDouble(values[14]), // pmraError
                        Double.parseDouble(values[15]), // pmdec
                        Double.parseDouble(values[16]), // pmdecError
                        Double.parseDouble(values[17]), // raDecCorr
                        Double.parseDouble(values[18]), // raParallaxCorr
                        Double.parseDouble(values[19]), // raPmraCorr
                        Double.parseDouble(values[20]), // raPmdecCorr
                        Double.parseDouble(values[21]), // decParallaxCorr
                        Double.parseDouble(values[22]), // decPmraCorr
                        Double.parseDouble(values[23]), // decPmdecCorr
                        Double.parseDouble(values[24]), // parallaxPmraCorr
                        Double.parseDouble(values[25]), // parallaxPmdecCorr
                        Double.parseDouble(values[26]), // pmraPmdecCorr
                        Integer.parseInt(values[27]), // astrometricNObsAl
                        Integer.parseInt(values[28]), // astrometricNObsAc
                        Integer.parseInt(values[29]), // astrometricNGoodObsAl
                        Integer.parseInt(values[30]), // astrometricNBadObsAl
                        Double.parseDouble(values[31]), // astrometricGofAl
                        Double.parseDouble(values[32]), // astrometricChi2Al
                        Double.parseDouble(values[33]), // astrometricExcessNoise
                        Double.parseDouble(values[34]), // astrometricExcessNoiseSig
                        Integer.parseInt(values[35]), // astrometricParamsSolved
                        Boolean.parseBoolean(values[36]), // astrometricPrimaryFlag
                        Double.parseDouble(values[37]), // nuEffUsedInAstrometry
                        Double.parseDouble(values[38]), // pseudocolour
                        Double.parseDouble(values[39]), // pseudocolourError
                        Double.parseDouble(values[40]), // raPseudocolourCorr
                        Double.parseDouble(values[41]), // decPseudocolourCorr
                        Double.parseDouble(values[42]), // parallaxPseudocolourCorr
                        Double.parseDouble(values[43]), // pmraPseudocolourCorr
                        Double.parseDouble(values[44]), // pmdecPseudocolourCorr
                        Integer.parseInt(values[45]), // astrometricMatchedTransits
                        Integer.parseInt(values[46]), // visibilityPeriodsUsed
                        Double.parseDouble(values[47]), // astrometricSigma5dMax
                        Integer.parseInt(values[48]), // matchedTransits
                        Integer.parseInt(values[49]), // newMatchedTransits
                        Integer.parseInt(values[50]), // matchedTransitsRemoved
                        Double.parseDouble(values[51]), // ipdGofHarmonicAmplitude
                        Double.parseDouble(values[52]), // ipdGofHarmonicPhase
                        Double.parseDouble(values[53]), // ipdFracMultiPeak
                        Double.parseDouble(values[54]), // ipdFracOddWin
                        Double.parseDouble(values[55]), // ruwe
                        Double.parseDouble(values[56]), // scanDirectionStrengthK1
                        Double.parseDouble(values[57]), // scanDirectionStrengthK2
                        Double.parseDouble(values[58]), // scanDirectionStrengthK3
                        Double.parseDouble(values[59]), // scanDirectionStrengthK4
                        Double.parseDouble(values[60]), // scanDirectionMeanK1
                        Double.parseDouble(values[61]), // scanDirectionMeanK2
                        Double.parseDouble(values[62]), // scanDirectionMeanK3
                        Double.parseDouble(values[63]), // scanDirectionMeanK4
                        Boolean.parseBoolean(values[64]), // duplicatedSource
                        Integer.parseInt(values[65]), // photGNObs
                        Double.parseDouble(values[66]), // photGMeanFlux
                        Double.parseDouble(values[67]), // photGMeanFluxError
                        Double.parseDouble(values[68]), // photGMeanFluxOverError
                        Double.parseDouble(values[69]), // photGMeanMag
                        Integer.parseInt(values[70]), // photBpNObs
                        Double.parseDouble(values[71]), // photBpMeanFlux
                        Double.parseDouble(values[72]), // photBpMeanFluxError
                        Double.parseDouble(values[73]), // photBpMeanFluxOverError
                        Double.parseDouble(values[74]), // photBpMeanMag
                        Integer.parseInt(values[75]), // photRpNObs
                        Double.parseDouble(values[76]), // photRpMeanFlux
                        Double.parseDouble(values[77]), // photRpMeanFluxError
                        Double.parseDouble(values[78]), // photRpMeanFluxOverError
                        Double.parseDouble(values[79]), // photRpMeanMag
                        Integer.parseInt(values[80]), // photBpNContaminatedTransits
                        Integer.parseInt(values[81]), // photBpNBlendedTransits
                        Integer.parseInt(values[82]), // photRpNContaminatedTransits
                        Integer.parseInt(values[83]), // photRpNBlendedTransits
                        Integer.parseInt(values[84]), // photProcMode
                        Double.parseDouble(values[85]), // photBpRpExcessFactor
                        Double.parseDouble(values[86]), // bpRp
                        Double.parseDouble(values[87]), // bpG
                        Double.parseDouble(values[88]), // gRp
                        Double.parseDouble(values[89]), // dr2RadialVelocity
                        Double.parseDouble(values[90]), // dr2RadialVelocityError
                        Integer.parseInt(values[91]), // dr2RvNbTransits
                        Double.parseDouble(values[92]), // dr2RvTemplateTeff
                        Double.parseDouble(values[93]), // dr2RvTemplateLogg
                        Double.parseDouble(values[94]), // dr2RvTemplateFeH
                        Double.parseDouble(values[95]), // l
                        Double.parseDouble(values[96]), // b
                        Double.parseDouble(values[97]), // eclLon
                        Double.parseDouble(values[98]) // eclLat
                );

                starDataList.add(starData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return starDataList;
    }
    
}
