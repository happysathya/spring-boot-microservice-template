package org.happysathya.route;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.happysathya.dto.InformationRequest;
import org.happysathya.dto.InformationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.ZonedDateTime;

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

    @RequestMapping(value = "/date", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get information for the provided data")
    public InformationResponse getDate(@RequestParam("departureTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime departureTime) {
        InformationResponse informationResponse = new InformationResponse();
        informationResponse.setName(departureTime.toString());
        return informationResponse;
    }
}
