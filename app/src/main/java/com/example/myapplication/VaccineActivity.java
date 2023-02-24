package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VaccineActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap map;
    SupportMapFragment mapFragment;
    SearchView searchView;
    ArrayList<LatLng>arrayList= new ArrayList<>();
    // Alfonso
    LatLng AlfonsoMH0 = new LatLng(14.138011305555949, 120.85531475784528);
    // Amadeo
    LatLng AmadeoMCC = new LatLng(14.170326937814462, 120.92210709647391);
    // Bacoor
    LatLng MainSB = new LatLng(14.427567747247153, 120.96462522531269);
    LatLng GreenVHC = new LatLng(114.412536448963952, 120.99049543880525);
    LatLng MolinoHC = new LatLng(14.402630303847843, 120.9850054329072);
    LatLng FloravilleHC = new LatLng(14.448614969558871, 120.95653913880565);
    // Carmona
    LatLng CarmonaCC = new LatLng(14.317043389424775, 121.05168196763991);
    // Cavite City
    LatLng MontanoH = new LatLng(14.482609887837183, 120.89658848113466);
    // Dasmarinas
    LatLng DMangubatSt = new LatLng(14.327712787774018, 120.93411356764001);
    LatLng DasmarinasHO = new LatLng(14.316836880931088, 120.98207291181855);
    LatLng Paliparan3HC = new LatLng(14.31841887024022, 120.98240020996852);
    // GMA
    LatLng CDH = new LatLng(14.297200903659181, 121.00680699647536);
    // GTC
    LatLng RGT = new LatLng(14.396579852803862, 120.86519256764089);
    // Imus
    LatLng VHC = new LatLng(14.43766210289832, 120.92752689058236);
    // Indang
    LatLng RHUI = new LatLng(14.19306951962959, 120.86795272530985);
    // Kawit
    LatLng RHUK = new LatLng(14.442068125081713, 120.90377835229846);
    // Magallanes
    LatLng MRHU = new LatLng(14.17837584541532, 120.7407724428722);
    // Maragondon
    LatLng CMH = new LatLng(14.277501241663755, 120.73366935414657);
    // Mendez
    LatLng RHUM = new LatLng(14.129908508790946, 120.90464464065215);
    // Naic
    LatLng RHUN = new LatLng(14.319011163804133, 120.7645228020388);
    // Noveleta
    LatLng NVC = new LatLng(14.428099280157463, 120.88069755229827);
    // Rosario
    LatLng SMCR = new LatLng(14.409400825324948, 120.85733015414817);
    // Silang
    LatLng RHUS = new LatLng(14.217358794363573, 120.9718560657886);
    // Tagaytay
    LatLng ONT = new LatLng(14.099572625079706, 120.94018210996595);
    // Tanza
    LatLng SMCT = new LatLng(14.391793642928683, 120.85054051756315);
    // Ternate
    LatLng TRNT = new LatLng(14.27495764874378, 120.6779694388036);
    // Trece Martires
    LatLng TM = new LatLng(14.28179772967644, 120.86591029647519);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_vaccine);
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);

        searchView = findViewById(R.id.sv_location);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String location = searchView.getQuery().toString();
                List<Address> addressList = null;
                if (location != null || !location.equals("")) {
                    Geocoder geocoder = new Geocoder((VaccineActivity.this));
                    try {
                        addressList = geocoder.getFromLocationName(location, 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Address address = addressList.get(0);
                    LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
                    map.addMarker(new MarkerOptions().position(latLng).title(location));
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15));
                    // Alfonso
                    arrayList.add(AlfonsoMH0);
                    // Amadeo
                    arrayList.add(AmadeoMCC);
                    // Bacoor
                    arrayList.add(MainSB);
                    arrayList.add(GreenVHC);
                    arrayList.add(MolinoHC);
                    arrayList.add(FloravilleHC);
                    // Carmona
                    arrayList.add(CarmonaCC);
                    // Cavite City
                    arrayList.add(MontanoH);
                    // Dasmarinas
                    arrayList.add(DMangubatSt);
                    arrayList.add(DasmarinasHO);
                    arrayList.add(Paliparan3HC);
                    // GMA
                    arrayList.add(CDH);
                    // GTC
                    arrayList.add(RGT);
                    // Imus
                    arrayList.add(VHC);
                    // Indang
                    arrayList.add(RHUI);
                    // Kawit
                    arrayList.add(RHUK);
                    // Magallanes
                    arrayList.add(MRHU);
                    // Maragondon
                    arrayList.add(CMH);
                    // Mendez
                    arrayList.add(RHUM);
                    // Naic
                    arrayList.add(RHUN);
                    // Noveleta
                    arrayList.add(NVC);
                    // Rosario
                    arrayList.add(SMCR);
                    // Silang
                    arrayList.add(RHUS);
                    // Tagaytay
                    arrayList.add(ONT);
                    // Tanza
                    arrayList.add(SMCT);
                    // Ternate
                    arrayList.add(TRNT);
                    // Trece Martires
                    arrayList.add(TM);

                    for (int i =0; i <arrayList.size(); i++) {
                        map.addMarker(new MarkerOptions().position(arrayList.get(i)).title(""));
                    }
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
        LatLng latLng = new LatLng(14.347069725507154, 120.88112804660854);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        googleMap.moveCamera(cameraUpdate);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setScrollGesturesEnabled(true);
    }
}