package org.happysathya.route;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.happysathya.dto.InformationRequest;
import org.happysathya.dto.InformationResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/")
@Api(description = "Load information")
public class InformationRoute {

    @RequestMapping(value = "/information", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get information for the provided data")
    public InformationResponse getInformation(@RequestBody @Valid InformationRequest informationRequest) {
        return new InformationResponse();
    }
}
