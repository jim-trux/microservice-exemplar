package com.trux.exemplar;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExemplarApplication extends Application<ExemplarConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ExemplarApplication().run(args);
    }

    @Override
    public String getName() {
        return "Exemplar";
    }

    @Override
    public void initialize(final Bootstrap<ExemplarConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ExemplarConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
